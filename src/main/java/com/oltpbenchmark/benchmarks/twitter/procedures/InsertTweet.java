/*
 * Copyright 2020 by OLTPBenchmark Project
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
 *
 */

package com.oltpbenchmark.benchmarks.twitter.procedures;

import com.oltpbenchmark.api.Procedure;
import com.oltpbenchmark.api.SQLStmt;
import com.oltpbenchmark.benchmarks.twitter.TwitterConstants;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

public class InsertTweet extends Procedure {

    //FIXME: Carlo is this correct? 1) added_tweets is empty initially 2) id is supposed to be not null
    public final SQLStmt insertTweet = new SQLStmt("/*monitor-insertTweet*/ INSERT INTO " + TwitterConstants.TABLENAME_ADDED_TWEETS + " (uid,text,createdate) VALUES (?, ?, ?)");

    public boolean run(Connection conn, long uid, String text, Time time) throws SQLException {
        try (PreparedStatement stmt = this.getPreparedStatement(conn, insertTweet)) {
            stmt.setLong(1, uid);
            stmt.setString(2, text);
            stmt.setDate(3, new java.sql.Date(System.currentTimeMillis()));
            return (stmt.execute());
        }
    }
}
