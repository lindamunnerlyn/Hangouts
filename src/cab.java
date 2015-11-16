// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class cab extends bzv
{

    private int a;
    private amf b;

    public cab(String s, int i, amf amf1)
    {
        super(s);
        a = i;
        b = amf1;
    }

    private void a(Context context, List list)
    {
        long l = System.currentTimeMillis();
        apd apd1 = ((apj)hgx.a(context, apj)).a(a).b();
        apd1.a();
        ContentValues contentvalues = new ContentValues();
        for (list = list.iterator(); list.hasNext();)
        {
            ebj ebj1 = (ebj)list.next();
            ceu aceu[] = (ceu[])ebj1.b;
            int j = aceu.length;
            int i = 0;
            while (i < j) 
            {
                ceu ceu1 = aceu[i];
                if (ceu1 != null && ceu1.a == cfa.b)
                {
                    contentvalues.clear();
                    contentvalues.put("is_hangouts_user", Boolean.valueOf(ceu1.z));
                    if (!TextUtils.isEmpty(ceu1.b()))
                    {
                        contentvalues.put("gaia_id", ceu1.b());
                        contentvalues.put("needs_gaia_ids_resolved", Boolean.valueOf(false));
                    }
                    contentvalues.put("avatar_url", ceu1.h);
                    contentvalues.put("display_name", ceu1.e);
                    contentvalues.put("last_checked_ts", Long.valueOf(l));
                    apd1.a("merged_contact_details", contentvalues, "lookup_data_standardized = ?", new String[] {
                        ((dac)ebj1.a).d
                    });
                }
                i++;
            }
        }

        apd1.b();
        apd1.c();
        context.getContentResolver().notifyChange(bzx.c, null);
    }

    private void a(Context context, Map map)
    {
        long l = System.currentTimeMillis();
        apd apd1 = ((apj)hgx.a(context, apj)).a(a).b();
        apd1.a();
        ContentValues contentvalues = new ContentValues();
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); apd1.a("merged_contact_details", contentvalues, "lookup_data_standardized = ?", new String[] {
    (String)entry.getKey()
}))
        {
            entry = (java.util.Map.Entry)map.next();
            contentvalues.clear();
            deo deo1 = (deo)entry.getValue();
            contentvalues.put("is_hangouts_user", Boolean.valueOf(deo1.a));
            if (!TextUtils.isEmpty(deo1.b))
            {
                contentvalues.put("gaia_id", deo1.b);
                contentvalues.put("needs_gaia_ids_resolved", Boolean.valueOf(false));
            }
            contentvalues.put("avatar_url", deo1.c);
            contentvalues.put("display_name", deo1.d);
            contentvalues.put("last_checked_ts", Long.valueOf(l));
        }

        apd1.b();
        apd1.c();
        context.getContentResolver().notifyChange(bzx.c, null);
    }

    private amf e(Context context)
    {
        Object obj;
        android.net.Uri.Builder builder;
        obj = null;
        builder = bzx.c.buildUpon();
        builder.appendQueryParameter("account_id", Integer.toString(a));
        builder.appendQueryParameter("contact_lookup_key", b.k());
        context = context.getContentResolver().query(builder.build(), bzx.f, null, null, null);
        obj = new bzy(null, context);
        if (!((bzy) (obj)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_89;
        }
        obj = ((bzy) (obj)).a();
        if (context != null)
        {
            context.close();
        }
        return ((amf) (obj));
        if (context != null)
        {
            context.close();
        }
        context = String.valueOf(b.k());
        if (context.length() != 0)
        {
            context = "After gaiaId resolution, couldn't find merged contact with lookup key:".concat(context);
        } else
        {
            context = new String("After gaiaId resolution, couldn't find merged contact with lookup key:");
        }
        ebw.f("Babel", context);
        return null;
        context;
_L2:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw context;
        Exception exception;
        exception;
        obj = context;
        context = exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected grk a(Context context)
    {
        Object obj1 = new HashSet();
        Object obj;
        obj = bzx.d.buildUpon();
        ((android.net.Uri.Builder) (obj)).appendQueryParameter("account_id", Integer.toString(a));
        String s = b.m();
        obj = context.getContentResolver().query(((android.net.Uri.Builder) (obj)).build(), bzx.g, "merged_contact_id = (select _id from merged_contacts where contact_id = ?) AND needs_gaia_ids_resolved AND lookup_data_type = 0", new String[] {
            s
        }, null);
        break MISSING_BLOCK_LABEL_66;
        context;
_L2:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw context;
        do
        {
            if (!((Cursor) (obj)).moveToNext())
            {
                break;
            }
            if (!((Cursor) (obj)).isNull(4))
            {
                ((Set) (obj1)).add(((Cursor) (obj)).getString(4));
            }
        } while (true);
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        obj = dbf.e(a);
        boolean flag;
        if (!((Set) (obj1)).isEmpty())
        {
            if (dbq.z(a))
            {
                obj1 = csl.a(a, 3, null, ((java.util.Collection) (obj1)));
                if (!((csl) (obj1)).m())
                {
                    a(context, ((den)((csl) (obj1)).e()).g);
                }
            } else
            {
                ConditionVariable conditionvariable = new ConditionVariable();
                cac cac1 = new cac(this, context, conditionvariable);
                if (!((Set) (obj1)).isEmpty())
                {
                    cac1.a(((java.util.Collection) (obj1)), a);
                    conditionvariable.block();
                    obj1 = cac1.a;
                    if (obj1 == null)
                    {
                        g.a(((ani) (obj)), 2512);
                        return new grk(0, cac1.b, context.getResources().getString(g.nc));
                    }
                    a(context, ((cwi) (obj1)).k());
                }
            }
        }
        g.a(((ani) (obj)), 2513);
        context = e(context);
        if (context != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = new grk(flag);
        ((grk) (obj)).d().putSerializable("hangouts_contact", context);
        return ((grk) (obj));
        context;
        obj = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public String b(Context context)
    {
        return context.getString(g.nd);
    }
}
