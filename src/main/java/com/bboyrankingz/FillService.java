/**
 *  Copyright 2005-2016 Red Hat, Inc.
 *
 *  Red Hat licenses this file to you under the Apache License, version
 *  2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package com.bboyrankingz;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;
 
@Path("/fill")
@Service
public interface FillService {
    
    @GET
    @Path("/{lon};{lat}")
    @HeaderParam("name")
    @Produces(MediaType.TEXT_PLAIN)
    void record(@PathParam("lon") Long lon, @PathParam("lat") Long lat, @HeaderParam("name") String name);

    @GET
    @Path("/get")
    @HeaderParam("name")
    @Produces(MediaType.TEXT_PLAIN)
    String get(@HeaderParam("name") String name);

}
