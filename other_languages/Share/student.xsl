<?xml version="1.0" encoding="gb2312"  ?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/TR/WD-xsl">
    <xsl:template match="/">
      <HTML>
          <HEAD>
               <TITLE>ѧ���ɼ��ǼǱ�</TITLE>
          </HEAD>
          <BODY bgcolor="pink">
               <TABLE  width="600px" border="30" >
                   <CAPTION>ѧ���ɼ��ǼǱ�</CAPTION>
                   <TR align="center">
                       <TH>ѧ��</TH>
                       <TH>����</TH>
                       <TH>�ܷ�</TH>
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