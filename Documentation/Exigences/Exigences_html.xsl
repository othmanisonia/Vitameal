<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<!--  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="exigences.xsd" xmlns:ns1="http://example.org/exigences"   -->
	<xsl:output method="html" indent="yes" encoding="utf-8"/>
	<xsl:strip-space elements="*"/>
	<xsl:variable name="SdL"><xsl:text>&#10;</xsl:text></xsl:variable>

	<xsl:template match="/">
		<xsl:text disable-output-escaping='yes'>&lt;!DOCtype HTML SYSTEM "about:legacy-compat"&gt;</xsl:text>
    	<html lang="fr">
    		<head>
    			<title>Exigences Vitameal</title>
    			<meta charset="utf-8"/>
    			<style type="text/css">
    				.bold { font-weight: bold;}
    				.italic { font-style: italic;}
    				table { border: 1px solid black;
    						border-collapse: collapse;
    						width: 100%}
    				td { width: 50%;}
    				thead { border: 1px solid black;
    					padding: 10px;}
    				tfoot { border: 1px solid black;
    					padding: 10px;}
    			</style>
    		</head>
    		<body>
					<xsl:apply-templates select="/exigences/exigence"/>
    		</body>
    	</html>
	</xsl:template>
	
	<xsl:template match="exigence">
		<table>
			<thead>
				<td colspan="2" style="text-align: left;"><span class="bold"><xsl:value-of select="concat(@numero, ' : ')"/></span><xsl:value-of select="titre"/></td>
			</thead>
			<tr>
				<td><span class="italic">Type : </span><xsl:value-of select="@type"/></td>
				<td><span class="italic">Nature : </span><xsl:value-of select="@nature"/></td>
			</tr>
			<tr>
				<td><span class="italic">Origine : </span><xsl:value-of select="origine"/></td>
				<td>
					<span class="italic">Liens : </span>
					<xsl:apply-templates select="liens/lien"/>
				</td>
			</tr>
			<tr>
				<td><span class="italic">Version : </span><xsl:value-of select="@version"/></td>
				<td><span class="italic">Validée : </span><xsl:value-of select="@validee"/></td>
			</tr>
			<tr>
				<td><span class="italic">Priorité : </span><xsl:value-of select="@priorite"/></td>
				<td><span class="italic">Test : </span><xsl:value-of select="test"/></td>
			</tr>
			<tfoot>
				<td colspan="2" style="text-align: left;"><xsl:value-of select="corps"/></td>
			</tfoot>
		</table>
		<br/>
	</xsl:template>
	
	<xsl:template match="lien">
		<xsl:value-of select="concat(., ' ')"/>
	</xsl:template>
</xsl:stylesheet>
