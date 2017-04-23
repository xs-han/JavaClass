<?xml version="1.0" encoding="gb2312"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/TR/WD-xsl">
  <xsl:template match="/">
   <HTML>
      <HEAD>
        <TITLE>家庭用户登录表</TITLE>
      </HEAD>
      <BODY>
       <TABLE border="3">
        <TR>
          <TH>u_id</TH>
          <TH>u_name</TH>
          <TH>u_pwd</TH>
          <TH>u_memo</TH>
        </TR>

      <xsl:for-each select="//row">
        <TR>
          <TD><xsl:value-of select="u_id"/></TD>
          <TD><xsl:value-of select="u_name"/></TD>
          <TD><xsl:value-of select="u_pwd"/></TD>
          <TD><xsl:value-of select="u_memo"/></TD>
        </TR>
      </xsl:for-each>   
      </TABLE>
     </BODY>
   </HTML>
  </xsl:template>
</xsl:stylesheet>