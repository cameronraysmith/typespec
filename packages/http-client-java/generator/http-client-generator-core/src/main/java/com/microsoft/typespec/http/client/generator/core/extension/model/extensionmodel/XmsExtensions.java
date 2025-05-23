// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.typespec.http.client.generator.core.extension.model.extensionmodel;

import java.util.List;

/**
 * Represents the x-ms-extensions of a model.
 */
public class XmsExtensions {
    private XmsEnum xmsEnum;
    private String xmsClientName;
    private XmsPageable xmsPageable;
    private boolean xmsSkipUrlEncoding;
    private boolean xmsClientFlatten;
    private boolean xmsLongRunningOperation;
    private XmsLongRunningOperationOptions xmsLongRunningOperationOptions;
    private boolean xmsFlattened;
    private boolean xmsAzureResource;
    private List<String> xmsMutability;
    private String xmsHeaderCollectionPrefix;
    private XmsInternalAutorestAnonymousSchema xmsInternalAutorestAnonymousSchema;
    private XmsArmIdDetails xmsArmIdDetails;
    private XmsExamples xmsExamples;
    private Boolean xmsSecret;
    private List<String> xmsVersioningAdded;

    /**
     * Creates a new instance of the XmsExtensions class.
     */
    public XmsExtensions() {
    }

    /**
     * Gets the enum of the model.
     *
     * @return The enum of the model.
     */
    public XmsEnum getXmsEnum() {
        return xmsEnum;
    }

    /**
     * Sets the enum of the model.
     *
     * @param xmsEnum The enum of the model.
     */
    public void setXmsEnum(XmsEnum xmsEnum) {
        this.xmsEnum = xmsEnum;
    }

    /**
     * Gets the client name of the model.
     *
     * @return The client name of the model.
     */
    public String getXmsClientName() {
        return xmsClientName;
    }

    /**
     * Sets the client name of the model.
     *
     * @param xmsClientName The client name of the model.
     */
    public void setXmsClientName(String xmsClientName) {
        this.xmsClientName = xmsClientName;
    }

    /**
     * Gets the pageable of the model.
     *
     * @return The pageable of the model.
     */
    public XmsPageable getXmsPageable() {
        return xmsPageable;
    }

    /**
     * Sets the pageable of the model.
     *
     * @param xmsPageable The pageable of the model.
     */
    public void setXmsPageable(XmsPageable xmsPageable) {
        this.xmsPageable = xmsPageable;
    }

    /**
     * Gets the skip URL encoding of the model.
     *
     * @return The skip URL encoding of the model.
     */
    public boolean isXmsSkipUrlEncoding() {
        return xmsSkipUrlEncoding;
    }

    /**
     * Sets the skip URL encoding of the model.
     *
     * @param xmsSkipUrlEncoding The skip URL encoding of the model.
     */
    public void setXmsSkipUrlEncoding(boolean xmsSkipUrlEncoding) {
        this.xmsSkipUrlEncoding = xmsSkipUrlEncoding;
    }

    /**
     * Gets the client flatten of the model.
     *
     * @return The client flatten of the model.
     */
    public boolean isXmsClientFlatten() {
        return xmsClientFlatten;
    }

    /**
     * Sets the client flatten of the model.
     *
     * @param xmsClientFlatten The client flatten of the model.
     */
    public void setXmsClientFlatten(boolean xmsClientFlatten) {
        this.xmsClientFlatten = xmsClientFlatten;
    }

    /**
     * Gets the long-running operation of the model.
     *
     * @return The long-running operation of the model.
     */
    public boolean isXmsLongRunningOperation() {
        return xmsLongRunningOperation;
    }

    /**
     * Sets the long-running operation of the model.
     *
     * @param xmsLongRunningOperation The long-running operation of the model.
     */
    public void setXmsLongRunningOperation(boolean xmsLongRunningOperation) {
        this.xmsLongRunningOperation = xmsLongRunningOperation;
    }

    /**
     * Gets the flattened of the model.
     *
     * @return The flattened of the model.
     */
    public boolean isXmsFlattened() {
        return xmsFlattened;
    }

    /**
     * Sets the flattened of the model.
     *
     * @param xmsFlattened The flattened of the model.
     */
    public void setXmsFlattened(boolean xmsFlattened) {
        this.xmsFlattened = xmsFlattened;
    }

    /**
     * Gets the Azure resource of the model.
     *
     * @return The Azure resource of the model.
     */
    public boolean isXmsAzureResource() {
        return xmsAzureResource;
    }

    /**
     * Sets the Azure resource of the model.
     *
     * @param xmsAzureResource The Azure resource of the model.
     */
    public void setXmsAzureResource(boolean xmsAzureResource) {
        this.xmsAzureResource = xmsAzureResource;
    }

    /**
     * Gets the mutability of the model.
     *
     * @return The mutability of the model.
     */
    public List<String> getXmsMutability() {
        return xmsMutability;
    }

    /**
     * Sets the mutability of the model.
     *
     * @param xmsMutability The mutability of the model.
     */
    public void setXmsMutability(List<String> xmsMutability) {
        this.xmsMutability = xmsMutability;
    }

    /**
     * Gets the header collection prefix of the model.
     *
     * @return The header collection prefix of the model.
     */
    public String getXmsHeaderCollectionPrefix() {
        return xmsHeaderCollectionPrefix;
    }

    /**
     * Sets the header collection prefix of the model.
     *
     * @param xmsHeaderCollectionPrefix The header collection prefix of the model.
     */
    public void setXmsHeaderCollectionPrefix(String xmsHeaderCollectionPrefix) {
        this.xmsHeaderCollectionPrefix = xmsHeaderCollectionPrefix;
    }

    /**
     * Gets the internal autorest anonymous schema of the model.
     *
     * @return The internal autorest anonymous schema of the model.
     */
    public XmsInternalAutorestAnonymousSchema getXmsInternalAutorestAnonymousSchema() {
        return xmsInternalAutorestAnonymousSchema;
    }

    /**
     * Sets the internal autorest anonymous schema of the model.
     *
     * @param xmsInternalAutorestAnonymousSchema The internal autorest anonymous schema of the model.
     */
    public void
        setXmsInternalAutorestAnonymousSchema(XmsInternalAutorestAnonymousSchema xmsInternalAutorestAnonymousSchema) {
        this.xmsInternalAutorestAnonymousSchema = xmsInternalAutorestAnonymousSchema;
    }

    /**
     * Gets the long-running operation options of the model.
     *
     * @return The long-running operation options of the model.
     */
    public XmsLongRunningOperationOptions getXmsLongRunningOperationOptions() {
        return xmsLongRunningOperationOptions;
    }

    /**
     * Sets the long-running operation options of the model.
     *
     * @param xmsLongRunningOperationOptions The long-running operation options of the model.
     */
    public void setXmsLongRunningOperationOptions(XmsLongRunningOperationOptions xmsLongRunningOperationOptions) {
        this.xmsLongRunningOperationOptions = xmsLongRunningOperationOptions;
    }

    /**
     * Gets the ARM ID details of the model.
     *
     * @return The ARM ID details of the model.
     */
    public XmsArmIdDetails getXmsArmIdDetails() {
        return xmsArmIdDetails;
    }

    /**
     * Sets the ARM ID details of the model.
     *
     * @param xmsArmIdDetails The ARM ID details of the model.
     */
    public void setXmsArmIdDetails(XmsArmIdDetails xmsArmIdDetails) {
        this.xmsArmIdDetails = xmsArmIdDetails;
    }

    /**
     * Gets the examples of the model.
     *
     * @return The examples of the model.
     */
    public XmsExamples getXmsExamples() {
        return xmsExamples;
    }

    /**
     * Sets the examples of the model.
     *
     * @param xmsExamples The examples of the model.
     */
    public void setXmsExamples(XmsExamples xmsExamples) {
        this.xmsExamples = xmsExamples;
    }

    /**
     * Gets the secret of the model.
     *
     * @return The secret of the model.
     */
    public Boolean getXmsSecret() {
        return xmsSecret;
    }

    /**
     * Sets the secret of the model.
     *
     * @param xmsSecret The secret of the model.
     */
    public void setXmsSecret(Boolean xmsSecret) {
        this.xmsSecret = xmsSecret;
    }

    /**
     * Gets the versioning added of the model.
     *
     * @return The versioning added of the model.
     */
    public List<String> getXmsVersioningAdded() {
        return xmsVersioningAdded;
    }

    /**
     * Sets the versioning added of the model.
     *
     * @param xmsVersioningAdded The versioning added of the model.
     */
    public void setXmsVersioningAdded(List<String> xmsVersioningAdded) {
        this.xmsVersioningAdded = xmsVersioningAdded;
    }
}
