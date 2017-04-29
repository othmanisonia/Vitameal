<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<!--  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="exigences.xsd" xmlns:ns1="http://example.org/exigences"   -->
	<xsl:output method="text" indent="yes" encoding="UTF-8"/>
	<xsl:strip-space elements="*"/>
	<xsl:variable name="SdL"><xsl:text>&#10;&#13;</xsl:text></xsl:variable>

	<xsl:template match="/">
		<xsl:value-of select="concat('\rowcolors{1}{}{}', $SdL)"/>
		<xsl:apply-templates select="/exigences/exigence"/>
	</xsl:template>
	
	<xsl:template match="exigence">
		<xsl:value-of select="concat('\begin{table}[!h]', $SdL)"/>
		<xsl:value-of select="concat('\begin{tabular}{|p{60mm}p{100mm}|}', $SdL)"/>
		<xsl:value-of select="concat('\hline', $SdL)"/>
		<xsl:value-of select="concat('\multicolumn{2}{|l|}{\textbf{', replace(@numero, '_', '\\_'), ':} ', titre, '} \\ \hline', $SdL)"/>
		<xsl:value-of select="concat('\emph{Type:} ', type, ' &amp; \emph{Liens:} ')"/>
		<xsl:apply-templates select="liens/lien"/>
		<xsl:value-of select="concat(' \\', $SdL)"/>
		<xsl:value-of select="concat('\emph{Origine:} ', origine, ' &amp; \emph{Validée:} ', validee, ' \\', $SdL)"/>
		<xsl:value-of select="concat('\emph{Version:} ', version, ' &amp; \emph{Test:} ', test, ' \\', $SdL)"/>
		<xsl:value-of select="concat('\emph{Priorité:} ', priorite, ' &amp; \\ \hline', 	$SdL)"/>
		<xsl:value-of select="concat('\multicolumn{2}{|p{16cm}|}{', corps, '} \\ \hline', $SdL)"/>
		<xsl:value-of select="concat('\end{tabular}', $SdL)"/>
		<xsl:value-of select="concat('\end{table}', $SdL)"/>
		<xsl:value-of select="concat($SdL, $SdL)"/>
	</xsl:template>
	
	<xsl:template match="lien">
		<xsl:value-of select="concat(replace(., '_', '\\_'), ' ')"/>
	</xsl:template>
</xsl:stylesheet>