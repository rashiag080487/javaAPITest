var http = require('http');
var format = require('xml-formatter');
var parser = require('xml2json');
var json = require('format-json');

var java = require('java');
java.classpath.push("./");
var myClass1 = java.import('package_one.ClassOne');

var req = `<operation>
<container type="GLOBAL">
   <field id="ACTION" value=""/>
   <field id="FUNCTION" value="GETDDLIST"/>
   <field id="LANGID" value="E"/>
   <field id="REQUESTCODE" value="FCSTS"/>
   <field id="SCREEN" value=""/>
   <field id="THREAD" value="1"/>
</container>
</operation>`;

var resp = format(myClass1.reqRespSync(req));

var jsonData = JSON.parse(parser.toJson(resp.toString()));

http.createServer(function(req, res) {
  res.writeHead(200, {
    'Content-Type': 'text/html'
  });

  res.write(`<html>
                <head>
                    <body>
                        <div id="xml-response">
                            <h3 style="text-align: center;">XML Response</h3>
                            <div style="background-color: #eff0f1; margin-bottom: 30px; padding: 20px;">
                                <xmp>
                                        ${resp}
                                </xmp>
                            </div>
                        </div>
                        <div id="JSONconv">
                            <h3 style="text-align: center;">JSON Conversion</h3>
                            <div style="background-color: #9fcbf7; margin-bottom: 30px; padding: 20px;">
                                <xmp>
                                        ${json.diffy(jsonData)}
                                </xmp>
                            </div>
                        </div>
                    </body>
                </head>
            </html>`
);
  res.end();
}).listen(3000, '127.0.0.1');


console.log('Server running at http://127.0.0.1:3000');