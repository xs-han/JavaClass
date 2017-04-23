<?xml version="1.0" encoding="gb2312"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/TR/WD-xsl">
  <xsl:template match="/">
<HTML>
  <HEAD>
    <TITLE>学生信息登记表</TITLE>
  </HEAD>
  <BODY>
    <TABLE border="3">
        <TR>
          <TH>sid</TH>
          <TH>sname</TH>
          <TH>sage</TH>
          <TH>smobile</TH>
          <TH>semail</TH>
          <TH>saddress</TH>
        </TR>

      <xsl:for-each select="//row">
        <TR>
          <TD><xsl:value-of select="sid"/></TD>
          <TD><xsl:value-of select="sname"/></TD>
          <TD><xsl:value-of select="sage"/></TD>
          <TD><xsl:value-of select="smobile"/></TD>
          <TD><xsl:value-of select="semail"/></TD>
          <TD><xsl:value-of select="saddress"/></TD>
        </TR>
      </xsl:for-each>   
    </TABLE>
  </BODY>
</HTML>
  </xsl:template>
</xsl:stylesheet>