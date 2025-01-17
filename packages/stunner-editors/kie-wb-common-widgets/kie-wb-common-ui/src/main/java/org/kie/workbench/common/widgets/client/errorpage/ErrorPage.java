/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.workbench.common.widgets.client.errorpage;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;

import com.google.gwt.user.client.ui.Composite;
import elemental2.dom.HTMLHeadingElement;
import elemental2.dom.HTMLParagraphElement;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

@Dependent
@Templated
public class ErrorPage extends Composite {

    @Inject
    @DataField
    @Named("h1")
    private HTMLHeadingElement title;

    @Inject
    @DataField
    private HTMLParagraphElement content;

    @Inject
    @DataField
    private HTMLParagraphElement errorContent;

    public void setTitle(final String titleMessage) {
        this.title.textContent = titleMessage;
    }

    public void setContent(final String message) {
        this.content.textContent = message;
    }

    public void setErrorContent(final String errorMessage) {
        this.errorContent.textContent = errorMessage;
    }

}
