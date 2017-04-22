<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<!--  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="Exigences.xsd" xmlns:ns1="http://example.org/Exigences"   -->
	<xsl:output method="html" indent="yes" encoding="utf-8"/>
	<xsl:strip-space elements="*"/>
	<xsl:variable name="SdL"><xsl:text>&#10;&#13;</xsl:text></xsl:variable>

	<xsl:template match="/">
		<xsl:text disable-output-escaping='yes'>&lt;!DOCTYPE HTML SYSTEM "about:legacy-compat"&gt;</xsl:text>
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
						<xsl:apply-templates select="/Exigences/Exigence"/>
    				</tr>
    			</table>
    		</body>
    	</html>
	</xsl:template>
	
	<xsl:template match="Exigence">
		<tr>
		<td><xsl:value-of select="@numéro"/></td>
		<td><xsl:value-of select="Titre"/></td>
		<td><xsl:value-of select="Type"/></td>
		<td><xsl:value-of select="Origine"/></td>
		<td><xsl:value-of select="Version"/></td>
		<td><xsl:value-of select="Priorité"/></td>
		<td><xsl:value-of select="Validée"/></td>
		<td>
		<xsl:apply-templates select="Liens/Lien"/>
		</td>
		<td><xsl:value-of select="Test"/></td>
		<td><xsl:value-of select="Corps"/></td>
		</tr>
	</xsl:template>
	
	<xsl:template match="Lien">
		<xsl:value-of select="concat(., ' ')"/>
	</xsl:template>
</xsl:stylesheet>
