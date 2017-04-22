<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<!--  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="Exigences.xsd" xmlns:ns1="http://example.org/Exigences"   -->
	<xsl:output method="text" indent="yes" encoding="UTF-8"/>
	<xsl:strip-space elements="*"/>
<xsl:variable name="SdL">
<xsl:text>
</xsl:text>
</xsl:variable>

	<xsl:template match="/">
		<xsl:value-of select="concat('\rowcolors{1}{}{}', $SdL)"/>
		<xsl:apply-templates select="/Exigences/Exigence"/>
	</xsl:template>
	
	<xsl:template match="Exigence">
		<xsl:value-of select="concat('\begin{table}[!h]', $SdL)"/>
		<xsl:value-of select="concat('\begin{tabular}{|p{60mm}p{100mm}|}', $SdL)"/>
		<xsl:value-of select="concat('\hline', $SdL)"/>
		<xsl:value-of select="concat('\multicolumn{2}{|l|}{\textbf{', replace(@numéro, '_', '\\_'), ':} ', Titre, '} \\ \hline', $SdL)"/>
		<xsl:value-of select="concat('\emph{Type:} ', Type, ' &amp; \emph{Liens:} ')"/>
		<xsl:apply-templates select="Liens/Lien"/>
		<xsl:value-of select="concat(' \\', $SdL)"/>
		<xsl:value-of select="concat('\emph{Origine:} ', Origine, ' &amp; \emph{Validé:} ', Validée, ' \\', $SdL)"/>
		<xsl:value-of select="concat('\emph{Version:} ', Version, ' &amp; \emph{Test:} ', Test, ' \\', $SdL)"/>
		<xsl:value-of select="concat('\emph{Priorité:} ', Priorité, ' &amp; \\ \hline', 	$SdL)"/>
		<xsl:value-of select="concat('\multicolumn{2}{|p{16cm}|}{', Corps, '} \\ \hline', $SdL)"/>
		<xsl:value-of select="concat('\end{tabular}', $SdL)"/>
		<xsl:value-of select="concat('\end{table}', $SdL)"/>
		<xsl:value-of select="concat($SdL, $SdL)"/>
	</xsl:template>
	
	<xsl:template match="Lien">
		<xsl:value-of select="concat(replace(., '_', '\\_'), ' ')"/>
	</xsl:template>
</xsl:stylesheet>