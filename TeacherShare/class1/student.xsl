<?xml version="1.0" encoding="gb2312"  ?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/TR/WD-xsl">
    <xsl:template match="/">
      <HTML>
          <HEAD>
               <TITLE>学生成绩登记表</TITLE>
          </HEAD>
          <BODY bgcolor="pink">
               <TABLE  width="600px" border="30" >
                   <CAPTION>学生成绩登记表</CAPTION>
                   <TR align="center">
                       <TH>学号</TH>
                       <TH>姓名</TH>
                       <TH>总分</TH>
                   </TR>
                   <xsl:for-each select="//row">
                       <TR>
                           <TD><xsl:value-of select="id"/></TD>
                           <TD><xsl:value-of select="name"/></TD>
                           <TD><xsl:value-of select="score"/></TD>
                       </TR>                
                   </xsl:for-each>
               </TABLE>
          </BODY>
      </HTML>
    </xsl:template>
</xsl:stylesheet>