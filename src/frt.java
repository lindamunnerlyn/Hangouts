// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.MergeCursor;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

public final class frt extends frn
{

    public static final String j[] = {
        "contact_id"
    };
    private final String k;

    public frt(Context context, frr frr, boolean flag, int i, Bundle bundle, Bundle bundle1, String s)
    {
        super(context, frr, flag, i, bundle, bundle1, null);
        k = s;
    }

    protected frf a(frq frq1, frq frq2, Cursor cursor)
    {
        g.d(frq1);
        g.d(cursor);
        fsf fsf1 = new fsf();
        fsf fsf2 = new fsf();
        int i = frq1.a();
        cursor.getCount();
        HashMap hashmap = new HashMap();
        h.a("people-map start");
        a(frq1, hashmap);
        h.a("people-map finish");
        ftf ftf1 = new ftf();
        fse fse1 = new fse();
        HashMap hashmap1 = new HashMap();
        b(frq2, hashmap1);
        h.a("contact-map start");
        int j1 = a(cursor, ftf1, fse1, hashmap1);
        h.a("contact-map finish");
        if (g.m(3))
        {
            (new StringBuilder("#people=")).append(i).append(", #contacts=").append(j1);
            g.m(3);
        }
        h.a("merge start");
        frq2 = new ArrayList();
        frq1.a(-1);
        while (frq1.c()) 
        {
            int l = frq1.b();
            String s1 = frq1.a("gaia_id");
            fsf1.a(l);
            frq2.add(s1);
            if (s1 == null || ftf1.a(s1) == 0)
            {
                fsf2.b();
            } else
            {
                fsf2.a(ftf1, s1);
            }
        }
        cursor.moveToPosition(0);
        while (!cursor.isAfterLast()) 
        {
            int k1 = cursor.getPosition();
            int l1 = fse1.a(k1);
            if (l1 == 0)
            {
                fsf1.b();
                fsf2.a(k1);
                frq2.add(null);
            } else
            {
                int i1 = 0;
                while (i1 < l1) 
                {
                    String s = fse1.a(k1, i1);
                    if (!hashmap.containsKey(s))
                    {
                        fsf1.b();
                        fsf2.a(k1);
                        frq2.add(s);
                    }
                    i1++;
                }
            }
            frk.a(cursor);
        }
        h.a("merge finish");
        return new frf(frq1.a, cursor, a, fsf1.a(), fsf1, fsf2, frq2, hashmap1, c, e);
    }

    protected Cursor c()
    {
        if (!i || android.os.Build.VERSION.SDK_INT < 18) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = frl.b.buildUpon().appendPath(k);
        ftc ftc1;
        boolean flag;
        if (!b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = ((android.net.Uri.Builder) (obj)).appendQueryParameter("visible_contacts_only", String.valueOf(flag)).build();
        ftc1 = new ftc();
        ftc1.b(frk.a());
        ftc1.b("(data1 IS NOT NULL AND data1!='')");
        obj = a.getContentResolver().query(((Uri) (obj)), frk.a, ftc1.toString(), null, "display_name COLLATE LOCALIZED,contact_id");
_L6:
        if (obj != null)
        {
            ((Cursor) (obj)).getCount();
        }
        return ((Cursor) (obj));
_L2:
        ftc ftc2;
        Object obj1;
        ftc2 = new ftc();
        frk.a(ftc2, b, a);
        frk.a(ftc2);
        h.a("lookup start");
        obj = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_FILTER_URI.buildUpon().appendPath(k).appendQueryParameter("limit", Integer.toString(100)).build();
        obj = a.getContentResolver().query(((Uri) (obj)), j, "(data1 IS NOT NULL AND data1!='')", null, null);
        obj1 = android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_FILTER_URI.buildUpon().appendPath(k).appendQueryParameter("limit", Integer.toString(100)).build();
        obj1 = a.getContentResolver().query(((Uri) (obj1)), j, "(data1 IS NOT NULL AND data1!='')", null, null);
        obj1 = new MergeCursor(new Cursor[] {
            new fru(((Cursor) (obj))), new fru(((Cursor) (obj1)))
        });
        int i;
        i = ((Cursor) (obj1)).getCount();
        h.a("lookup finish");
        if (i == 0)
        {
            ((Cursor) (obj1)).close();
            return null;
        }
        ftc2.b("contact_id IN (");
        obj = "";
_L4:
        if (!((Cursor) (obj1)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        ftc2.a(((String) (obj)));
        ftc2.a(Long.toString(((Cursor) (obj1)).getLong(0)));
        obj = ",";
        if (true) goto _L4; else goto _L3
_L3:
        ftc2.a(")");
        ((Cursor) (obj1)).close();
        obj = a.getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, frk.a, ftc2.toString(), null, "display_name COLLATE LOCALIZED,contact_id");
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
        ((Cursor) (obj1)).close();
        throw exception;
    }

}
