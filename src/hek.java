// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Field;

public final class hek
{

    private static final hm a = new hm();

    private static Field a(kop kop)
    {
        Class class1 = kop.getClass();
        hm hm1 = a;
        hm1;
        JVM INSTR monitorenter ;
        Field field = (Field)a.get(class1);
        kop = field;
        if (field != null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        kop = class1.getField("apiHeader");
        a.put(class1, kop);
        hm1;
        JVM INSTR monitorexit ;
        return kop;
        kop;
        hm1;
        JVM INSTR monitorexit ;
        throw kop;
    }

    public static void a(Context context, kop kop, String s, int i)
    {
        Object obj = null;
        lgw lgw1 = new lgw();
        Object obj1 = new lhf();
        obj1.a = Integer.valueOf(g.H(context));
        obj1.b = Integer.valueOf(g.I(context));
        obj1.c = Integer.valueOf(g.J(context));
        lgw1.j = Integer.valueOf(g.G(context));
        lgw1.p = ((lhf) (obj1));
        lgw1.i = s;
        s = (hdw)hgx.b(context, hdw);
        hss hss1;
        if (s != null)
        {
            s = s.b();
        } else
        {
            s = null;
        }
        if (!TextUtils.isEmpty(s))
        {
            lgw1.m = s;
        }
        s = new kue();
        s.b = hgx.b(context, "com.google.android.libraries.social.appid");
        if (g.L(context))
        {
            s.a = 3;
        } else
        {
            s.a = 2;
        }
        s.c = 2;
        s.d = i;
        lgw1.n = s;
        try
        {
            obj1 = a(kop);
            hss1 = new hss();
            hss1.b = lgw1;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("PlusiUtils", "Failed to find apiHeader field on an http request, this should not happen", context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("PlusiUtils", "apiHeader field on http request was not accessible, this should not happen", context);
            return;
        }
        s = obj;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        context = (gsm)hgx.b(context, gsm);
        s = obj;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        s = context.a();
        hss1.d = s;
        ((Field) (obj1)).set(kop, hss1);
        return;
    }

}
