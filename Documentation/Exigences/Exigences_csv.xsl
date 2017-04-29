<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<!--  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="exigences.xsd" xmlns:ns1="http://example.org/exigences"   -->
	<xsl:output method="text" indent="yes" encoding="CP1252"/>
	<xsl:strip-space elements="*"/>
	<xsl:variable name="SdL"><xsl:text>&#13;&#10;</xsl:text></xsl:variable>

	<xsl:template match="/">
		<xsl:value-of select="concat('N°; Titre; Type; Nature; Origine; Version; Priorité; Validée; Liens; Test; Corps', $SdL)"/>
		<xsl:apply-templates select="/exigences/exigence"/>
	</xsl:template>
	
	<xsl:template match="exigence">
		<xsl:value-of select="concat('=&quot;', @numero, '&quot;;')"/>
		<xsl:value-of select="concat('=&quot;', titre, '&quot;;')"/>
		<xsl:value-of select="concat('=&quot;', @type, '&quot;;')"/>
		<xsl:value-of select="concat('=&quot;', @nature, '&quot;;')"/>
		<xsl:value-of select="concat('=&quot;', origine, '&quot;;')"/>
		<xsl:value-of select="concat('=&quot;', @version, '&quot;;')"/>
		<xsl:value-of select="concat('=&quot;', @priorite, '&quot;;')"/>
		<xsl:value-of select="concat('=&quot;', @validee, '&quot;;')"/>
		<xsl:text>=&quot;</xsl:text>
		<xsl:apply-templates select="liens/lien"/>
		<xsl:text>&quot;;</xsl:text>
		<xsl:value-of select="concat('=&quot;', test, '&quot;;')"/>
		<xsl:value-of select="concat('=&quot;', replace(corps, '\n', ' '), '&quot;', $SdL)"/>
	</xsl:template>
	
	<xsl:template match="lien">
		<xsl:value-of select="concat(., ' ')"/>
	</xsl:template>
</xsl:stylesheet>