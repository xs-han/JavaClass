<?xml version="1.0" encoding="gb2312" ?>
<myxsl:stylesheet xmlns:myxsl="http://www.w3.org/TR/WD-xsl">
	<myxsl:template match="/">
		<HTML>
			<HEAD>
				<TITLE>Family Administation System</TITLE>
			</HEAD>
			<BODY bgcolor="pink">
				<center>
					<TABLE width="600px" border="3" cellpadding="30" cellspacing="20">
						<CAPTION>Information of all members</CAPTION>
						<TR align="center">
							<TH>user id</TH>
							<TH>user name</TH>
							<TH>user passwd</TH>
						</TR>
						<myxsl:for-each select="//row">
							<TR align="center">
								<TD><myxsl:value-of select="u_id"/></TD>
								<TD><myxsl:value-of select="u_name"/></TD>
								<TD><myxsl:value-of select="u_pwd"/></TD>
							</TR>
						</myxsl:for-each>
					</TABLE>
				</center>
			</BODY>
		</HTML>
	</myxsl:template>
</myxsl:stylesheet>