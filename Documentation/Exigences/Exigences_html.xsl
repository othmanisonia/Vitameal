<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<!--  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="exigences.xsd" xmlns:ns1="http://example.org/exigences"   -->
	<xsl:output method="html" indent="yes" encoding="utf-8"/>
	<xsl:strip-space elements="*"/>
	<xsl:variable name="SdL"><xsl:text>&#10;&#13;</xsl:text></xsl:variable>

	<xsl:template match="/">
		<xsl:text disable-output-escaping='yes'>&lt;!DOCtype HTML SYSTEM "about:legacy-compat"&gt;</xsl:text>
    	<html lang="fr">
    		<head>
    			<title>Exigences Vitameal</title>
    			<meta charset="utf-8"/>
    			<style>
    				table { border: 1px solid black;
    						border-collapse: collapse;}
    				td { border: 1px solid black;
    					padding: 10px;}
    				th { border: 1px solid black;
    					padding: 10px;}
    			</style>
    		</head>
    		<body>
    			<table>
    				<tr>
    					<th>N°</th><th>Titre</th><th>Type</th><th>Origine</th><th>Version</th><th>Priorité</th><th>Validée</th><th>Liens</th><th>Test</th><th>Corps</th>
						<xsl:apply-templates select="/exigences/exigence"/>
    				</tr>
    			</table>
    		</body>
    	</html>
	</xsl:template>
	
	<xsl:template match="exigence">
		<tr>
		<td><xsl:value-of select="@numero"/></td>
		<td><xsl:value-of select="titre"/></td>
		<td><xsl:value-of select="type"/></td>
		<td><xsl:value-of select="origine"/></td>
		<td><xsl:value-of select="version"/></td>
		<td><xsl:value-of select="priorite"/></td>
		<td><xsl:value-of select="validee"/></td>
		<td>
		<xsl:apply-templates select="liens/lien"/>
		</td>
		<td><xsl:value-of select="test"/></td>
		<td><xsl:value-of select="corps"/></td>
		</tr>
	</xsl:template>
	
	<xsl:template match="lien">
		<xsl:value-of select="concat(., ' ')"/>
	</xsl:template>
</xsl:stylesheet>
