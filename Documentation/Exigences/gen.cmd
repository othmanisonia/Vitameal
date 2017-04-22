@REM -*- coding:cp850-dos; -*-
@echo off
set XsltProcPath=D:\Programmes\saxon
java -jar %XsltProcPath%\saxon9he.jar -ext:on -o:Exigences.tex -xsl:Exigences.xsl -s:Exigences.xml %1 -warnings:silent
java -jar %XsltProcPath%\saxon9he.jar -ext:on -o:Exigences.csv -xsl:Exigences_csv.xsl -s:Exigences.xml %1 -warnings:silent
java -jar %XsltProcPath%\saxon9he.jar -ext:on -o:Exigences.html -xsl:Exigences_html.xsl -s:Exigences.xml %1 -warnings:silent
