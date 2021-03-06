<?xml version="1.0"?>
<!-- Copyright (c) 2013 Sean Muir. All rights reserved. This program and 
	the accompanying materials are made available under the terms of the Eclipse 
	Public License v1.0 which accompanies this distribution, and is available 
	at http://www.eclipse.org/legal/epl-v10.html Contributors: Sean Muir (JKM 
	Software) - initial implementation -->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:fo="http://www.w3.org/1999/XSL/Format" xmlns:dita2xslfo="http://dita-ot.sourceforge.net/ns/200910/dita2xslfo"
	version="1.0" exclude-result-prefixes="dita2xslfo">

	<xsl:variable name="productName">

		<xsl:choose>
			<xsl:when test="$map/bookmeta/prodinfo/prodname">
				<xsl:value-of select="$map/bookmeta/prodinfo/prodname" />
			</xsl:when>
			<xsl:otherwise>
				Missing Product Name in BookMap (bookmap/bookmeta/prodinfo/prodname)
			</xsl:otherwise>
		</xsl:choose>
		_
		<xsl:choose>
			<xsl:when test="$map/bookmeta/prodinfo/vrmlist[1]/vrm[1]/@release">
				<xsl:value-of select="$map/bookmeta/prodinfo/vrmlist[1]/vrm[1]/@release" />
			</xsl:when>
			<xsl:otherwise>
				Missing Release (DSTU) in BookMap
				(bookmap/bookmeta/prodinfo/vrmlist/vrm/@release)
			</xsl:otherwise>
		</xsl:choose>
		_
		<xsl:choose>
			<xsl:when test="$map/bookmeta/prodinfo/vrmlist[1]/vrm[1]/@version">
				<xsl:value-of select="$map/bookmeta/prodinfo/vrmlist[1]/vrm[1]/@version" />
			</xsl:when>
			<xsl:otherwise>
				Missing Version (YYYYMM) in BookMap
				(bookmap/bookmeta/prodinfo/vrmlist/vrm/@version)
			</xsl:otherwise>
		</xsl:choose>

	</xsl:variable>


	<xsl:variable name="productBrand">
		<xsl:choose>
			<xsl:when test="$map/bookmeta/prodinfo/brand">
				<xsl:value-of select="$map/bookmeta/prodinfo/brand" />
			</xsl:when>
			<xsl:otherwise>
				Missing Product Brand (HL7 IG for CDA R2) in BookMap
				(bookmap/bookmeta/prodinfo/brand)
			</xsl:otherwise>
		</xsl:choose>

	</xsl:variable>


	<xsl:variable name="productSeries">
		<xsl:choose>
			<xsl:when test="$map/bookmeta/prodinfo/series">
				<xsl:value-of select="$map/bookmeta/prodinfo/series" />
			</xsl:when>
			<xsl:otherwise>
				Missing Product Series (Draft Standard for Trial Use) in BookMap
				(bookmap/bookmeta/prodinfo/series)
			</xsl:otherwise>
		</xsl:choose>

	</xsl:variable>


	<xsl:variable name="productPlatform">
		<xsl:choose>
			<xsl:when test="$map/bookmeta/prodinfo/platform">
				<xsl:value-of select="$map/bookmeta/prodinfo/platform" />
			</xsl:when>
			<xsl:otherwise>
				Missing Product Platform (Universal Realm) in BookMap
				(bookmap/bookmeta/prodinfo/platform)
			</xsl:otherwise>
		</xsl:choose>
	</xsl:variable>


<!-- 

Page 2                                                                   HL7 CDA R2 IG Birth and Fetal Death Report, Release 1- US Realm
© 2015 Health Level Seven International.  All rights reserved.                                                              February 2015
 -->

	<xsl:template name="insertBodyOddFooter">
		<fo:static-content flow-name="odd-body-footer">
		 <fo:block xsl:use-attribute-sets="__body__odd__footer">
			<fo:table table-layout="fixed" inline-progression-dimension="100%">
				<fo:table-column column-width="50%" />
				<fo:table-column column-width="50%" />
				<fo:table-body>
					<fo:table-row>				
						<fo:table-cell>
							<fo:block text-align="start">
								Page
								<fo:page-number />
							</fo:block>
						</fo:table-cell>	
						<fo:table-cell>
						<fo:block text-align="end">
								<xsl:value-of select="$productBrand" /><xsl:text> </xsl:text><xsl:value-of select="$map//*[contains(@class,' bookmap/booktitlealt ')][1]" /><xsl:text> - </xsl:text><xsl:value-of select="$productPlatform" />
							</fo:block>
						</fo:table-cell>
					</fo:table-row>
					<fo:table-row>	
						<fo:table-cell >
							<fo:block text-align="left">
								<xsl:choose>
									<xsl:when test="$map/bookmeta/bookrights/bookowner/organization">
										<xsl:for-each
											select="$map/bookmeta/bookrights/bookowner/organization">
											<xsl:text>&#xA9; </xsl:text>
											<xsl:value-of select="$map/bookmeta/bookrights/copyrlast/year" />
											<xsl:text> </xsl:text>
											<xsl:value-of select="." />
											<xsl:text>. All rights reserved</xsl:text>
										</xsl:for-each>
									</xsl:when>
									<xsl:otherwise>
										Missing Book Rights Organization (Health Level Seven
										International) in BookMap
										(bookmap/bookmeta/bookrights/bookowner/organization)
									</xsl:otherwise>
								</xsl:choose>
							</fo:block>
						</fo:table-cell>
						<fo:table-cell>
							<fo:block text-align="end">
								<xsl:value-of
									select="format-dateTime(current-dateTime(),'[MNn] [Y0001]')" />
							</fo:block>
						</fo:table-cell>
					</fo:table-row>
				</fo:table-body>
			</fo:table>
			</fo:block>
		</fo:static-content>
	</xsl:template>

	<xsl:template name="insertBodyEvenFooter">
		<fo:static-content flow-name="even-body-footer">
		   <fo:block xsl:use-attribute-sets="__body__even__footer">
				<fo:table table-layout="fixed" inline-progression-dimension="100%">
				<fo:table-column column-width="50%" />
				<fo:table-column column-width="50%" />
				<fo:table-body>
					<fo:table-row>				
						<fo:table-cell>
							<fo:block text-align="start">
								Page
								<fo:page-number />
							</fo:block>
						</fo:table-cell>	
						<fo:table-cell>
						<fo:block text-align="end">
								<xsl:value-of select="$productBrand" /><xsl:text> </xsl:text><xsl:value-of select="$map//*[contains(@class,' bookmap/booktitlealt ')][1]" /><xsl:text> - </xsl:text><xsl:value-of select="$productPlatform" />
							</fo:block>
						</fo:table-cell>
					</fo:table-row>
					<fo:table-row>	
						<fo:table-cell >
							<fo:block text-align="left">
								<xsl:choose>
									<xsl:when test="$map/bookmeta/bookrights/bookowner/organization">
										<xsl:for-each
											select="$map/bookmeta/bookrights/bookowner/organization">
											<xsl:text>&#xA9; </xsl:text>
											<xsl:value-of select="$map/bookmeta/bookrights/copyrlast/year" />
											<xsl:text> </xsl:text>
											<xsl:value-of select="." />
											<xsl:text>. All rights reserved</xsl:text>
										</xsl:for-each>
									</xsl:when>
									<xsl:otherwise>
										Missing Book Rights Organization (Health Level Seven
										International) in BookMap
										(bookmap/bookmeta/bookrights/bookowner/organization)
									</xsl:otherwise>
								</xsl:choose>
							</fo:block>
						</fo:table-cell>
						<fo:table-cell>
							<fo:block text-align="end">
								<xsl:value-of
									select="format-dateTime(current-dateTime(),'[MNn] [Y0001]')" />
							</fo:block>
						</fo:table-cell>
					</fo:table-row>
				</fo:table-body>
			</fo:table>
			</fo:block>
		</fo:static-content>
	</xsl:template>

	<xsl:template name="createFrontMatter_1.0">
		<xsl:choose>
			<xsl:when test="$map/bookmeta/prodinfo/series= 'DSTU'">
				<xsl:call-template name="createFrontMatter_CDADSTU" />
			</xsl:when>
			<xsl:otherwise>
				<xsl:call-template name="createFrontMatter_CDANormative" />
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	
	<xsl:template name="createFrontMatter_CDADSTU">
		<fo:page-sequence master-reference="body-odd">
			<fo:static-content flow-name="odd-body-header">
				<fo:block xsl:use-attribute-sets="__body__odd__header">
					<xsl:value-of select="$productName" />
				</fo:block>
			</fo:static-content>
			<fo:flow flow-name="xsl-region-body">
				<fo:block xsl:use-attribute-sets="__frontmatter">
					<!-- set the title -->
					<fo:block xsl:use-attribute-sets="__frontmatter__title">
						<xsl:choose>
							<xsl:when test="$map/*[contains(@class,' topic/title ')][1]">
								<xsl:apply-templates
									select="$map/*[contains(@class,' topic/title ')][1]" />
							</xsl:when>
							<xsl:when
								test="$map//*[contains(@class,' bookmap/mainbooktitle ')][1]">
								<xsl:apply-templates
									select="$map//*[contains(@class,' bookmap/mainbooktitle ')][1]" />
							</xsl:when>
							<xsl:when test="//*[contains(@class, ' map/map ')]/@title">
								<xsl:value-of select="//*[contains(@class, ' map/map ')]/@title" />
							</xsl:when>
							<xsl:otherwise>
								<xsl:value-of
									select="/descendant::*[contains(@class, ' topic/topic ')][1]/*[contains(@class, ' topic/title ')]" />
							</xsl:otherwise>
						</xsl:choose>
					</fo:block>
					<!-- set the subtitle -->
					<xsl:apply-templates
						select="$map//*[contains(@class,' bookmap/booktitlealt ')]" />
				</fo:block>
				<fo:block space-after="5mm" xsl:use-attribute-sets="topic">
					Publication of this draft standard for trial use and comment has
					been approved by Health
					Level Seven International (HL7). This draft
					standard is not an
					accredited American
					National Standard. The comment
					period for use of this draft standard shall
					end 24
					months from the
					date of publication. Suggestions for revision should be
					submitted at
					<fo:basic-link external-destination="http://www.hl7.org/dstucomments/index.cfm">
						http://www.hl7.org/dstucomments/index.cfm
					</fo:basic-link>
					.
				</fo:block>
				<fo:block space-after="10mm" xsl:use-attribute-sets="topic">
					Following this 24 month
					evaluation period, this draft standard,
					revised as
					necessary, will
					be submitted to a normative ballot in
					preparation for approval by
					ANSI as an American
					National Standard.
					Implementations of this draft
					standard shall be viable
					throughout the
					normative ballot process and
					for up to six months after publication
					of the
					relevant
					normative
					standard.
				</fo:block>
				<fo:block xsl:use-attribute-sets="tm__content">
					Copyright &#169; <xsl:value-of select="$map/bookmeta/bookrights/copyrlast/year" />
					Health Level Seven International &#174; ALL RIGHTS
					RESERVED. The
					reproduction of this material in any form
					is strictly
					forbidden
					without the written permission of the
					publisher. HL7
					International
					and Health Level Seven are registered
					trademarks of
					Health Level
					Seven International. Reg. U.S. Pat &amp;
					TM Off.
				</fo:block>
			</fo:flow>
		</fo:page-sequence>

		<fo:page-sequence master-reference="body-odd">
			<fo:flow flow-name="xsl-region-body">
				<fo:block xsl:use-attribute-sets="topic">
					<fo:block xsl:use-attribute-sets="__spectitle">Important Notes
					</fo:block>
					<fo:list-block xsl:use-attribute-sets="ol">
						<fo:list-item xsl:use-attribute-sets="ol.li">
							<fo:list-item-label xsl:use-attribute-sets="ol.li__label">
								<fo:block xsl:use-attribute-sets="ol.li__label__content">
									A
								</fo:block>
							</fo:list-item-label>
							<fo:list-item-body xsl:use-attribute-sets="ol.li__body">
								<fo:block xsl:use-attribute-sets="ol.li__content">
									<fo:inline font-weight="bold">If you are the
										individual that
										downloaded or ordered this HL7
										Standard,
										specification or other
										work (in each and every instance
										"Material"),
									</fo:inline>
									the
									following describes
									the permitted uses of the
									Material.

								</fo:block>
							</fo:list-item-body>
						</fo:list-item>
						<fo:list-item xsl:use-attribute-sets="ol.li">
							<fo:list-item-label xsl:use-attribute-sets="ol.li__label">
								<fo:block xsl:use-attribute-sets="ol.li__label__content">
									B
								</fo:block>
							</fo:list-item-label>
							<fo:list-item-body xsl:use-attribute-sets="ol.li__body">
								<fo:block xsl:use-attribute-sets="ol.li__content">
									<fo:inline font-weight="bold">If you are NOT such
										individual,
									</fo:inline>
									you are not authorized to make any use of the
									Material.
									To obtain
									an authorized copy of this Material, please
									visit
									http://www.hl7.org/implement/standards/index.cfm.
								</fo:block>
							</fo:list-item-body>
						</fo:list-item>
						<fo:list-item xsl:use-attribute-sets="ol.li">
							<fo:list-item-label xsl:use-attribute-sets="ol.li__label">
								<fo:block xsl:use-attribute-sets="ol.li__label__content">
									C
								</fo:block>
							</fo:list-item-label>
							<fo:list-item-body xsl:use-attribute-sets="ol.li__body">
								<fo:block xsl:use-attribute-sets="ol.li__content">
									<fo:inline font-weight="bold">If you are not an HL7
										Organizational Member,
									</fo:inline>
									the following are your permitted uses of
									this Material:
								</fo:block>
								<fo:block xsl:use-attribute-sets="topic">
									<fo:list-block xsl:use-attribute-sets="ol">
										<fo:list-item xsl:use-attribute-sets="ol.li">
											<fo:list-item-label
												xsl:use-attribute-sets="ol.li__label">
												<fo:block xsl:use-attribute-sets="ol.li__label__content">
													1
												</fo:block>
											</fo:list-item-label>
											<fo:list-item-body xsl:use-attribute-sets="ol.li__body">
												<fo:block xsl:use-attribute-sets="ol.li__content">
													<fo:inline font-weight="bold">Read and Copy
														License Only.
													</fo:inline>
													HL7 hereby grants you the right,
													without
													charge,
													to download
													and copy (for personal use only) this
													Material
													for study
													purposes only. This
													license grant does not
													include the right
													to sublicense or modify
													the Material, or
													to
													implement the
													Material, either in whole in part, in any
													product or
													service.
													Please see
													http://www.hl7.org/legal/ippolicy.cfm for
													the full
													license
													terms governing the
													Material.
												</fo:block>
											</fo:list-item-body>
										</fo:list-item>
									</fo:list-block>
								</fo:block>
							</fo:list-item-body>
						</fo:list-item>
						<fo:list-item xsl:use-attribute-sets="ol.li">
							<fo:list-item-label xsl:use-attribute-sets="ol.li__label">
								<fo:block xsl:use-attribute-sets="ol.li__label__content">
									D
								</fo:block>
							</fo:list-item-label>
							<fo:list-item-body xsl:use-attribute-sets="ol.li__body">
								<fo:block xsl:use-attribute-sets="ol.li__content">
									<fo:inline font-weight="bold">If you are an HL7
										Organizational Member,
									</fo:inline>
									the following are your permitted uses of
									this
									Material:
								</fo:block>
								<fo:block xsl:use-attribute-sets="topic">
									<fo:list-block xsl:use-attribute-sets="ol">
										<fo:list-item xsl:use-attribute-sets="ol.li">
											<fo:list-item-label
												xsl:use-attribute-sets="ol.li__label">
												<fo:block xsl:use-attribute-sets="ol.li__label__content">
													1
												</fo:block>
											</fo:list-item-label>
											<fo:list-item-body xsl:use-attribute-sets="ol.li__body">
												<fo:block xsl:use-attribute-sets="ol.li__content">
													<fo:inline font-weight="bold">Implementation
														License
														Terms.
													</fo:inline>
												</fo:block>
												<fo:block xsl:use-attribute-sets="topic">
													<fo:list-block xsl:use-attribute-sets="ol">
														<fo:list-item xsl:use-attribute-sets="ol.li">
															<fo:list-item-label
																xsl:use-attribute-sets="ol.li__label">
																<fo:block xsl:use-attribute-sets="ol.li__label__content">
																	1.1
																</fo:block>
															</fo:list-item-label>
															<fo:list-item-body
																xsl:use-attribute-sets="ol.li__body">
																<fo:block xsl:use-attribute-sets="ol.li__content">
																	<fo:inline font-weight="bold">Definitions.
																	</fo:inline>
																	As used in this Agreement, the following
																	terms shall
																	have the
																	following definitions:
																	<fo:block>
																		<fo:inline font-weight="bold">"Compliant Product"
																		</fo:inline>
																		is a
																		product or service that implements
																		Material that is
																		an
																		HL7 Specification in whole or in part.
																	</fo:block>
																	<fo:block>
																		<fo:inline font-weight="bold">"End User"
																		</fo:inline>
																		is a
																		company, entity or individual that is the
																		ultimate
																		purchaser or
																		licensee from Licensee of a Compliant
																		Product.
																	</fo:block>
																</fo:block>
															</fo:list-item-body>
														</fo:list-item>
														<fo:list-item xsl:use-attribute-sets="ol.li">
															<fo:list-item-label
																xsl:use-attribute-sets="ol.li__label">
																<fo:block xsl:use-attribute-sets="ol.li__label__content">
																	1.2
																</fo:block>
															</fo:list-item-label>
															<fo:list-item-body
																xsl:use-attribute-sets="ol.li__body">
																<fo:block xsl:use-attribute-sets="ol.li__content">
																	<fo:inline font-weight="bold">License.</fo:inline>
																	In consideration of becoming an
																	Organizational member of
																	HL7 and
																	continuing to pay the appropriate HL7
																	Organizational membership
																	fees in full, HL7
																	hereby grants
																	to you without additional charge, on a
																	perpetual (except
																	as provided for in
																	the full license terms governing the
																	Material),
																	non-exclusive and worldwide basis, the
																	right
																	to (a) download, copy (for internal purposes only) and
																	share this Material with your
																	employees and consultants
																	for study purposes, and (b) utilize
																	the Material for the
																	purpose of developing, making, having made, using,
																	marketing,
																	importing, offering to sell
																	or license, and
																	selling or licensing, and to otherwise
																	distribute,
																	Compliant Products, in all
																	cases subject to the
																	conditions set forth in this Agreement
																	and any relevant
																	patent and
																	other intellectual property rights of third
																	parties (which
																	may include members of HL7).
																	No other
																	license, sublicense, or other rights of any kind
																	are
																	granted under this
																	Agreement.

																</fo:block>
															</fo:list-item-body>
														</fo:list-item>

													</fo:list-block>
												</fo:block>
											</fo:list-item-body>
										</fo:list-item>
									</fo:list-block>
								</fo:block>
								<fo:block xsl:use-attribute-sets="topic">
									Please see
									http://www.hl7.org/legal/ippolicy.cfm for the
									full license terms
									governing the Material.
								</fo:block>

							</fo:list-item-body>
						</fo:list-item>
					</fo:list-block>
				</fo:block>
			</fo:flow>
		</fo:page-sequence>

			
	</xsl:template>

	<xsl:template name="createFrontMatter_CDANormative">
		<fo:page-sequence master-reference="body-odd">
			<fo:static-content flow-name="odd-body-header">
				<fo:block xsl:use-attribute-sets="__body__odd__header">
					<xsl:value-of select="$productName" />
				</fo:block>
			</fo:static-content>

			<fo:static-content flow-name="odd-body-footer">
				<fo:table table-layout="fixed"
					inline-progression-dimension="100%">
					<fo:table-column column-width="10%" />
					<fo:table-column column-width="80%" />
					<fo:table-column column-width="10%" />
					<fo:table-body>
						<fo:table-row>
							<fo:table-cell>

							</fo:table-cell>
							<fo:table-cell>
								<fo:block xsl:use-attribute-sets="tm__content">
									Copyright &#169;
									<xsl:value-of select="$map/bookmeta/bookrights/copyrlast/year" />
									Health Level Seven International &#174; ALL RIGHTS
									RESERVED. The
									reproduction of this material in any form
									is strictly
									forbidden
									without the written permission of the
									publisher. HL7
									International
									and Health Level Seven are registered
									trademarks of
									Health Level
									Seven International. Reg. U.S. Pat &amp;
									TM Off.
								</fo:block>
							</fo:table-cell>
							<fo:table-cell>

							</fo:table-cell>
						</fo:table-row>

						<fo:table-row>
							<fo:table-cell>

							</fo:table-cell>
							<fo:table-cell>
								<fo:block xsl:use-attribute-sets="tm__content">
									Use of this material is governed by HL7's
									<fo:basic-link external-destination="http://www.hl7.org/legal/ippolicy.cfm">IP Compliance
										Policy
									</fo:basic-link>
									.
								</fo:block>
							</fo:table-cell>
							<fo:table-cell>

							</fo:table-cell>
						</fo:table-row>

					</fo:table-body>
				</fo:table>

			</fo:static-content>

			<fo:flow flow-name="xsl-region-body">
				<fo:block xsl:use-attribute-sets="__frontmatter">
					<fo:table table-layout="fixed"
						inline-progression-dimension="100%">
						<fo:table-column column-width="100%" />

						<fo:table-body>

							<fo:table-row>
								<fo:table-cell>
									<fo:block text-align="left">
										<xsl:apply-templates select="$map/booktitle/booktitlealt[2]" />
									</fo:block>
								</fo:table-cell>
							</fo:table-row>

							<fo:table-row>
								<fo:table-cell>
									<fo:block text-align="right" xsl:use-attribute-sets="__frontmatter__subtitle">
										<xsl:choose>
											<xsl:when test="$map/*[contains(@class,' topic/title ')][1]">
												<xsl:apply-templates
													select="$map/*[contains(@class,' topic/title ')][1]" />
											</xsl:when>
											<xsl:when
												test="$map//*[contains(@class,' bookmap/mainbooktitle ')][1]">
												<xsl:apply-templates
													select="$map//*[contains(@class,' bookmap/mainbooktitle ')][1]" />
											</xsl:when>
											<xsl:when test="//*[contains(@class, ' map/map ')]/@title">
												<xsl:value-of select="//*[contains(@class, ' map/map ')]/@title" />
											</xsl:when>
											<xsl:otherwise>
												<xsl:value-of
													select="/descendant::*[contains(@class, ' topic/topic ')][1]/*[contains(@class, ' topic/title ')]" />
											</xsl:otherwise>
										</xsl:choose>

									</fo:block>
								</fo:table-cell>

							</fo:table-row>

							<fo:table-row>
								<fo:table-cell>
									<fo:block text-align="right" xsl:use-attribute-sets="__frontmatter__subtitle">
										<xsl:apply-templates select="$map/booktitle/booktitlealt[1]" />
									</fo:block>
								</fo:table-cell>
							</fo:table-row>

						
							<fo:table-row>
								<fo:table-cell>
									<fo:block text-align="right" xsl:use-attribute-sets="__frontmatter__subtitle">
										HL7
										<xsl:value-of select="$map/bookmeta/prodinfo/series" />
										Ballot
									</fo:block>
								</fo:table-cell>
							</fo:table-row>

						


							<fo:table-row>
								<fo:table-cell>
									<fo:block text-align="right" xsl:use-attribute-sets="__frontmatter__owner">
										Sponsored By:
									</fo:block>
								</fo:table-cell>
							</fo:table-row>
							<xsl:for-each select="$map/bookmeta/author">

								<fo:table-row>
									<fo:table-cell>
										<fo:block text-align="right" xsl:use-attribute-sets="__frontmatter__owner">
											<xsl:apply-templates select="." />
										</fo:block>
									</fo:table-cell>
								</fo:table-row>


							</xsl:for-each>


						</fo:table-body>
					</fo:table>

				</fo:block>
			</fo:flow>

		</fo:page-sequence>


	</xsl:template>
</xsl:stylesheet>
