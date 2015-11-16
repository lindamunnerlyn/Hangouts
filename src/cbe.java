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
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class cbe extends cay
{

    private int a;
    private amx b;

    public cbe(String s, int i, amx amx1)
    {
        super(s);
        a = i;
        b = amx1;
    }

    private void a(Context context, Collection collection, Map map)
    {
        long l = System.currentTimeMillis();
        apv apv1 = ((aqb)hlp.a(context, aqb)).a(a).b();
        apv1.a();
        ContentValues contentvalues = new ContentValues();
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) 
        {
            map = (java.util.Map.Entry)iterator.next();
            dfx dfx1 = (dfx)map.getValue();
            if (collection.size() == 1)
            {
                map = (String)collection.iterator().next();
            } else
            {
                map = (String)map.getKey();
            }
            a(apv1, contentvalues, dfx1.a, dfx1.b, dfx1.c, dfx1.d, l, ((String) (map)));
        }
        apv1.b();
        apv1.c();
        context.getContentResolver().notifyChange(cba.c, null);
    }

    private void a(Context context, List list)
    {
        long l = System.currentTimeMillis();
        apv apv1 = ((aqb)hlp.a(context, aqb)).a(a).b();
        apv1.a();
        ContentValues contentvalues = new ContentValues();
        for (list = list.iterator(); list.hasNext();)
        {
            eeh eeh1 = (eeh)list.next();
            cfz acfz[] = (cfz[])eeh1.b;
            int j = acfz.length;
            int i = 0;
            while (i < j) 
            {
                cfz cfz1 = acfz[i];
                if (cfz1 != null && cfz1.a == cgf.b)
                {
                    if (!TextUtils.isEmpty(((dbi)eeh1.a).d))
                    {
                        a(apv1, contentvalues, cfz1.z, cfz1.b(), cfz1.h, cfz1.e, l, ((dbi)eeh1.a).d);
                    }
                    if (!TextUtils.isEmpty(((dbi)eeh1.a).c))
                    {
                        a(apv1, contentvalues, cfz1.z, cfz1.b(), cfz1.h, cfz1.e, l, ((dbi)eeh1.a).c);
                    }
                }
                i++;
            }
        }

        apv1.b();
        apv1.c();
        context.getContentResolver().notifyChange(cba.c, null);
    }

    private static void a(apv apv1, ContentValues contentvalues, boolean flag, String s, String s1, String s2, long l, 
            String s3)
    {
        contentvalues.clear();
        contentvalues.put("is_hangouts_user", Boolean.valueOf(flag));
        if (!TextUtils.isEmpty(s))
        {
            contentvalues.put("gaia_id", s);
            contentvalues.put("needs_gaia_ids_resolved", Boolean.valueOf(false));
        }
        contentvalues.put("avatar_url", s1);
        contentvalues.put("display_name", s2);
        contentvalues.put("last_checked_ts", Long.valueOf(l));
        apv1.a("merged_contact_details", contentvalues, "lookup_data = ? OR lookup_data_standardized = ?", new String[] {
            s3, s3
        });
    }

    private amx e(Context context)
    {
        Object obj;
        android.net.Uri.Builder builder;
        obj = null;
        builder = cba.c.buildUpon();
        builder.appendQueryParameter("account_id", Integer.toString(a));
        builder.appendQueryParameter("contact_lookup_key", b.k());
        context = context.getContentResolver().query(builder.build(), cba.f, null, null, null);
        obj = new cbb(null, context);
        if (!((cbb) (obj)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_89;
        }
        obj = ((cbb) (obj)).a();
        if (context != null)
        {
            context.close();
        }
        return ((amx) (obj));
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
        eev.f("Babel", context);
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

    protected gvv a(Context context)
    {
        Object obj1;
        Object obj2;
        obj1 = new HashSet();
        obj2 = new HashSet();
        Object obj;
        obj = cba.d.buildUpon();
        ((android.net.Uri.Builder) (obj)).appendQueryParameter("account_id", Integer.toString(a));
        String s = b.m();
        obj = context.getContentResolver().query(((android.net.Uri.Builder) (obj)).build(), cba.g, "merged_contact_id = (select _id from merged_contacts where contact_id = ?) AND needs_gaia_ids_resolved AND (lookup_data_type = 0 OR lookup_data_type = 1)", new String[] {
            s
        }, null);
_L5:
        if (!((Cursor) (obj)).moveToNext()) goto _L2; else goto _L1
_L1:
        if (((Cursor) (obj)).getInt(2) != 0 || ((Cursor) (obj)).isNull(4)) goto _L4; else goto _L3
_L3:
        ((Set) (obj2)).add(((Cursor) (obj)).getString(4));
          goto _L5
        context;
_L7:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw context;
_L4:
        if (((Cursor) (obj)).getInt(2) != 1) goto _L5; else goto _L6
_L6:
        ((Set) (obj1)).add(((Cursor) (obj)).getString(3));
          goto _L5
_L2:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        obj = dcn.e(a);
        boolean flag;
        if (dcz.B(a))
        {
            if (!((Set) (obj2)).isEmpty())
            {
                cuo cuo1 = cuo.a(a, 3, null, ((Collection) (obj2)));
                if (!cuo1.m())
                {
                    a(context, ((Collection) (obj2)), ((dfw)cuo1.e()).g);
                }
            }
            if (!((Set) (obj1)).isEmpty())
            {
                obj2 = cuo.a(a, 2, null, ((Collection) (obj1)));
                if (!((cuo) (obj2)).m())
                {
                    a(context, ((Collection) (obj1)), ((dfw)((cuo) (obj2)).e()).g);
                }
            }
        } else
        {
            if (!((Set) (obj2)).isEmpty())
            {
                ConditionVariable conditionvariable1 = new ConditionVariable();
                cbf cbf2 = new cbf(this, context, conditionvariable1);
                cbf2.a(((Collection) (obj2)), a);
                conditionvariable1.block();
                obj2 = cbf2.a;
                if (obj2 == null)
                {
                    g.a(((aoa) (obj)), 2512);
                    return new gvv(0, cbf2.b, context.getResources().getString(g.nd));
                }
                a(context, ((cym) (obj2)).k());
            }
            if (!((Set) (obj1)).isEmpty())
            {
                ConditionVariable conditionvariable = new ConditionVariable();
                cbf cbf1 = new cbf(this, context, conditionvariable);
                cbf1.b(((Collection) (obj1)), a);
                conditionvariable.block();
                obj1 = cbf1.a;
                if (obj1 == null)
                {
                    g.a(((aoa) (obj)), 2512);
                    return new gvv(0, cbf1.b, context.getResources().getString(g.nd));
                }
                a(context, ((cym) (obj1)).k());
            }
        }
        g.a(((aoa) (obj)), 2513);
        context = e(context);
        if (context != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = new gvv(flag);
        ((gvv) (obj)).d().putSerializable("hangouts_contact", context);
        return ((gvv) (obj));
        context;
        obj = null;
          goto _L7
    }

    public String b(Context context)
    {
        return context.getString(g.ne);
    }
}
