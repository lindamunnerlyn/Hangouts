// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.mergedcontacts.impl;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import aps;
import apv;
import atu;
import cba;
import cbo;
import eev;
import gqz;
import grd;
import hlp;
import java.util.Locale;

// Referenced classes of package com.google.android.apps.hangouts.mergedcontacts.impl:
//            MergeContactsService

public class MergedContactProviderImpl extends cba
{

    private static final UriMatcher h;
    private final Object i = new Object();

    public MergedContactProviderImpl()
    {
    }

    private static transient String[] a(String as[], String as1[])
    {
        if (as1.length == 0)
        {
            return as;
        }
        String as2[];
        int j;
        int k;
        if (as == null)
        {
            j = 0;
        } else
        {
            j = as.length;
        }
        k = as1.length;
        as2 = new String[j + k];
        if (j > 0)
        {
            System.arraycopy(as, 0, as2, 0, j);
        }
        System.arraycopy(as1, 0, as2, j, k);
        return as2;
    }

    public int delete(Uri uri, String s, String as[])
    {
        throw new UnsupportedOperationException();
    }

    public String getType(Uri uri)
    {
        switch (h.match(uri))
        {
        default:
            uri = String.valueOf(uri);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(uri).length() + 13)).append("Unknown URI: ").append(uri).toString());

        case 0: // '\0'
            return "vnd.android.cursor.dir/vnd.google.android.apps.hangouts.merged_contacts";

        case 1: // '\001'
            return "vnd.android.cursor.dir/vnd.google.android.apps.hangouts.merged_contact_details";
        }
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        throw new UnsupportedOperationException();
    }

    public boolean onCreate()
    {
        return true;
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        SQLiteQueryBuilder sqlitequerybuilder;
        int j;
        String s2 = uri.getQueryParameter("account_id");
        if (s2 == null)
        {
            as = String.valueOf("Every URI must have the 'account_id' parameter specified.\nURI: ");
            uri = String.valueOf(uri);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(as).length() + 0 + String.valueOf(uri).length())).append(as).append(uri).toString());
        }
        j = Integer.parseInt(s2);
        sqlitequerybuilder = new SQLiteQueryBuilder();
        h.match(uri);
        JVM INSTR tableswitch 0 1: default 112
    //                   0 224
    //                   1 776;
           goto _L1 _L2 _L3
_L1:
        long l = SystemClock.elapsedRealtime();
        as = aps.a(getContext(), j).a().a(sqlitequerybuilder, as, s, as1, s1, null);
        long l1 = SystemClock.elapsedRealtime();
        s = String.valueOf(sqlitequerybuilder.getTables());
        eev.e("Babel_db", (new StringBuilder(String.valueOf(s).length() + 38)).append("querying ").append(s).append(" took ").append(l1 - l).append(" ms").toString());
        as.setNotificationUri(getContext().getContentResolver(), uri);
        return as;
_L2:
        String s7 = uri.getQueryParameter("gaia_id");
        String s6 = uri.getQueryParameter("phone_number");
        String s5 = uri.getQueryParameter("contact_lookup_key");
        String s3 = uri.getQueryParameter("conversation_type");
        Object obj1 = uri.getQueryParameter("query");
        String as2[];
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (uri.getQueryParameter("is_frequent") != null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        sqlitequerybuilder.setTables("merged_contacts_with_details");
        flag1 = false;
        as2 = as1;
        if (!TextUtils.isEmpty(s7))
        {
            sqlitequerybuilder.appendWhere("_id in (select merged_contact_id from merged_contact_details where gaia_id = ?)");
            as2 = a(as1, new String[] {
                s7
            });
            flag1 = true;
        }
        flag = flag1;
        as1 = as2;
        if (!TextUtils.isEmpty(s6))
        {
            if (flag1)
            {
                sqlitequerybuilder.appendWhere(" AND ");
            }
            sqlitequerybuilder.appendWhere("_id in (select merged_contact_id from merged_contact_details where lookup_data = ? or lookup_data_standardized = ?)");
            as1 = a(as2, new String[] {
                s6, s6
            });
            flag = true;
        }
        flag1 = flag;
        as2 = as1;
        if (!TextUtils.isEmpty(s5))
        {
            if (flag)
            {
                sqlitequerybuilder.appendWhere(" AND ");
            }
            sqlitequerybuilder.appendWhere("contact_lookup_key = ?");
            as2 = a(as1, new String[] {
                s5
            });
            flag1 = true;
        }
        flag = flag1;
        if (!TextUtils.isEmpty(s3))
        {
            flag = flag1;
            if (Integer.parseInt(s3) == atu.b.ordinal())
            {
                if (flag1)
                {
                    sqlitequerybuilder.appendWhere(" AND ");
                }
                sqlitequerybuilder.appendWhere("has_phone_number");
                flag = true;
            }
        }
        flag1 = flag;
        as1 = as2;
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            if (flag)
            {
                sqlitequerybuilder.appendWhere(" AND ");
            }
            String s4 = String.format(Locale.getDefault(), "(%s like '%%' || ? || '%%' OR %s in (select %s from %s where %s like '%%' || ? || '%%' OR %s like '%%' || ? || '%%'))", new Object[] {
                "display_name", "_id", "merged_contact_id", "merged_contact_details", "lookup_data", "lookup_data_search"
            });
            as1 = a(as2, new String[] {
                obj1, obj1, obj1
            });
            sqlitequerybuilder.appendWhere(s4);
            flag1 = true;
        }
        if (flag2)
        {
            if (flag1)
            {
                sqlitequerybuilder.appendWhere(" AND ");
            }
            sqlitequerybuilder.appendWhere("is_frequent");
        }
        obj1 = new Intent(getContext(), com/google/android/apps/hangouts/mergedcontacts/impl/MergeContactsService);
        ((Intent) (obj1)).putExtra("account_id", j);
        if (((gqz)hlp.a(getContext(), gqz)).b(j).a("last_merged_ts", -1L) == -1L)
        {
            synchronized (i)
            {
                if (((gqz)hlp.a(getContext(), gqz)).b(j).a("last_merged_ts", -1L) == -1L)
                {
                    eev.e("Babel_db", "MergedContactProviderImpl calling MergeContactsService synchronously");
                    (new cbo(this)).onHandleIntent(((Intent) (obj1)));
                }
            }
        } else
        {
            getContext().startService(((Intent) (obj1)));
        }
        continue; /* Loop/switch isn't completed */
        uri;
        obj;
        JVM INSTR monitorexit ;
        throw uri;
_L3:
        sqlitequerybuilder.setTables("merged_contact_details");
        if (true) goto _L1; else goto _L4
_L4:
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        throw new UnsupportedOperationException();
    }

    static 
    {
        UriMatcher urimatcher = new UriMatcher(-1);
        h = urimatcher;
        urimatcher.addURI(a, "merged_contacts", 0);
        h.addURI(a, "merged_contact_details", 1);
    }
}
