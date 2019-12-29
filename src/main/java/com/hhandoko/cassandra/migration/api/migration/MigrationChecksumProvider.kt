/**
 * File     : MigrationChecksumProvider.kt
 * License  :
 *   Original   - Copyright (c) 2010 - 2016 Boxfuse GmbH
 *   Derivative - Copyright (c) 2016 - 2018 cassandra-migration Contributors
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *           http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.hhandoko.cassandra.migration.api.migration

/**
 * Migration implementors that also implement this interface will be able to specify their checksum
 * (for validation), instead of having it automatically computed or default to `null` (for Java Migrations).
 */
interface MigrationChecksumProvider {

    /**
     * Computes the checksum of the migration.
     *
     * @return The checksum of the migration.
     */
    val checksum: Int?

}