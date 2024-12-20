<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<?mso-application progid="Word.Document"?>
<w:wordDocument xmlns:w="http://schemas.microsoft.com/office/word/2003/wordml">
    <w:body>
        <w:p>
            <w:pPr>
                <w:jc w:val="center"/>
            </w:pPr>
            <w:r>
                <w:rPr>
                    <w:b/>
                    <w:sz w:val="32"/>
                </w:rPr>
                <w:t>测试文档</w:t>
            </w:r>
        </w:p>

        <w:p>
            <w:r>
                <w:t>姓名：${name}</w:t>
            </w:r>
        </w:p>

        <w:p>
            <w:r>
                <w:t>年龄：${age}</w:t>
            </w:r>
        </w:p>

        <w:p>
            <w:r>
                <w:t>日期：${date}</w:t>
            </w:r>
        </w:p>

        <w:p>
            <w:r>
                <w:t>爱好：</w:t>
            </w:r>
        </w:p>
        <#list hobbies as hobby>
            <w:p>
                <w:r>
                    <w:t>- ${hobby}</w:t>
                </w:r>
            </w:p>
        </#list>
    </w:body>
</w:wordDocument>
