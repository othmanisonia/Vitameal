@REM -*- coding:cp850-dos; -*-
@echo off
set XsltProcPath=D:\Programmes\saxon
java -jar %XsltProcPath%\saxon9he.jar -ext:on -o:Exigences.tex -xsl:Exigences.xsl -s:Exigences.xml %1 -warnings:silent
