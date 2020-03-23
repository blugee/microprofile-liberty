// tag::comment[]
/*******************************************************************************
 * Copyright (c) 2018 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
 // end::comment[]
package com.microprofile.demo.model;

import javax.json.bind.annotation.JsonbCreator;
import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbTransient;

public class Artist {
    public String name;
    public Album albums[];
    public boolean legendary = true;

    public Artist() {

    }
    
    public Artist(
      @JsonbProperty("name") String name,
      @JsonbProperty("albums") Album albums[]) {
      this.name = name;
      this.albums = albums;
    }

    @Override
    public String toString() {
      return name + " wrote " + albums.length + " albums";
    }
}