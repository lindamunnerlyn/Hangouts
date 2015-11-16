// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

public final class frs extends frn
{

    private static final String j[] = {
        "contact_id"
    };

    public frs(Context context, frr frr, boolean flag, int i, Bundle bundle, Bundle bundle1, String s)
    {
        super(context, frr, flag, i, bundle, bundle1, s);
    }

    private String e()
    {
        String s = null;
        if (f) goto _L2; else goto _L1
_L1:
        s = "";
_L4:
        return s;
_L2:
        Cursor cursor;
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        stringbuilder.append("contact_id IN(");
        cursor = a.getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, j, f(), null, null);
        if (cursor == null) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        if (!cursor.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        stringbuilder.append(",");
        stringbuilder.append(cursor.getLong(0));
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
        stringbuilder.append(")");
        cursor.close();
        return stringbuilder.toString();
        Exception exception;
        exception;
        cursor.close();
        throw exception;
    }

    private String f()
    {
        g.a(f);
        Object obj = a();
        g.d(obj);
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("data1 IN(");
        obj = new frq(((com.google.android.gms.common.data.DataHolder) (obj)));
        boolean flag = true;
        for (; ((frq) (obj)).c(); DatabaseUtils.appendEscapedSQLString(stringbuilder, ((frq) (obj)).a("value")))
        {
            if (!flag)
            {
                stringbuilder.append(",");
            }
            flag = false;
        }

        stringbuilder.append(")");
        return stringbuilder.toString();
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
        int i1 = a(cursor, ftf1, fse1, hashmap1);
        h.a("contact-map finish");
        if (g.m(3))
        {
            (new StringBuilder("#people=")).append(i).append(", #contacts=").append(i1);
            g.m(3);
        }
        h.a("merge start");
        frq1.a(0);
        cursor.moveToPosition(0);
        ArrayList arraylist = new ArrayList();
        do
        {
            String s;
            int k;
            int j1;
            if (!frq1.d())
            {
                k = 1;
            } else
            {
                k = 0;
            }
            if (!cursor.isAfterLast())
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            if (k == 0 && j1 == 0)
            {
                break;
            }
            if (k != 0)
            {
                frq2 = frq1.a("name");
            } else
            {
                frq2 = null;
            }
            if (j1 != 0)
            {
                s = cursor.getString(1);
            } else
            {
                s = null;
            }
            if (k != 0 && j1 != 0)
            {
                k = a(((String) (frq2)), s);
            } else
            if (k != 0)
            {
                k = -1;
            } else
            {
                k = 1;
            }
            if (k <= 0)
            {
                j1 = frq1.b();
                frq2 = frq1.a("gaia_id");
                fsf1.a(j1);
                arraylist.add(frq2);
                if (frq2 == null || ftf1.a(frq2) == 0)
                {
                    fsf2.b();
                } else
                {
                    fsf2.a(ftf1, frq2);
                }
                frq1.c();
            }
            if (k >= 0)
            {
                j1 = cursor.getPosition();
                int k1 = fse1.a(j1);
                if (k1 == 0)
                {
                    fsf1.b();
                    fsf2.a(j1);
                    arraylist.add(null);
                } else
                {
                    int l = 0;
                    while (l < k1) 
                    {
                        frq2 = fse1.a(j1, l);
                        if (!hashmap.containsKey(frq2))
                        {
                            fsf1.b();
                            fsf2.a(j1);
                            arraylist.add(frq2);
                        }
                        l++;
                    }
                }
                frk.a(cursor);
            }
        } while (true);
        h.a("merge finish");
        return new frf(frq1.a, cursor, a, fsf1.a(), fsf1, fsf2, arraylist, hashmap1, c, e);
    }

    protected Cursor c()
    {
        Object obj1 = null;
        Object obj = e();
        if (obj != null)
        {
            if (i && android.os.Build.VERSION.SDK_INT >= 18)
            {
                obj1 = frl.a.buildUpon();
                ftc ftc2;
                boolean flag;
                if (!b)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj1 = ((android.net.Uri.Builder) (obj1)).appendQueryParameter("visible_contacts_only", String.valueOf(flag)).build();
                ftc2 = new ftc();
                ftc2.b(frk.a());
                ftc2.b(((String) (obj)));
                ftc2.b("(data1 IS NOT NULL AND data1!='')");
                obj = a.getContentResolver().query(((Uri) (obj1)), frk.a, ftc2.toString(), null, "display_name COLLATE LOCALIZED,contact_id");
            } else
            {
                ftc ftc1 = new ftc();
                frk.a(ftc1, b, a);
                frk.a(ftc1);
                ftc1.b(((String) (obj)));
                ftc1.b("(data1 IS NOT NULL AND data1!='')");
                obj = a.getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, frk.a, ftc1.toString(), null, "display_name COLLATE LOCALIZED,contact_id");
            }
            obj1 = obj;
            if (obj != null)
            {
                ((Cursor) (obj)).getCount();
                return ((Cursor) (obj));
            }
        }
        return ((Cursor) (obj1));
    }

}
