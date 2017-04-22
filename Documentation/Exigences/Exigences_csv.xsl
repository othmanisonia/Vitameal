<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<!--  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="Exigences.xsd" xmlns:ns1="http://example.org/Exigences"   -->
	<xsl:output method="text" indent="yes" encoding="CP1252"/>
	<xsl:strip-space elements="*"/>
	<xsl:variable name="SdL"><xsl:text>&#13;&#10;</xsl:text></xsl:variable>

	<xsl:template match="/">
		<xsl:value-of select="concat('N°; Titre; Type; Origine; Version; Priorité; Validée; Liens; Test; Corps', $SdL)"/>
		<xsl:apply-templates select="/Exigences/Exigence"/>
	</xsl:template>
	
	<xsl:template match="Exigence">
		<xsl:value-of select="concat('=&quot;', @numéro, '&quot;;')"/>
		<xsl:value-of select="concat('=&quot;', Titre, '&quot;;')"/>
		<xsl:value-of select="concat('=&quot;', Type, '&quot;;')"/>
		<xsl:value-of select="concat('=&quot;', Origine, '&quot;;')"/>
		<xsl:value-of select="concat('=&quot;', Version, '&quot;;')"/>
		<xsl:value-of select="concat('=&quot;', Priorité, '&quot;;')"/>
		<xsl:value-of select="concat('=&quot;', Validée, '&quot;;')"/>
		<xsl:text>=&quot;</xsl:text>
		<xsl:apply-templates select="Liens/Lien"/>
		<xsl:text>&quot;;</xsl:text>
		<xsl:value-of select="concat('=&quot;', Test, '&quot;;')"/>
		<xsl:value-of select="concat('=&quot;', replace(Corps, '\n', ' '), '&quot;', $SdL)"/>
	</xsl:template>
	
	<xsl:template match="Lien">
		<xsl:value-of select="concat(., ' ')"/>
	</xsl:template>
</xsl:stylesheet>