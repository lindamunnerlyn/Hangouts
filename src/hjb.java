// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Field;

public final class hjb
{

    private static final hm a = new hm();

    private static Field a(kws kws)
    {
        Class class1 = kws.getClass();
        hm hm1 = a;
        hm1;
        JVM INSTR monitorenter ;
        Field field = (Field)a.get(class1);
        kws = field;
        if (field != null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        kws = class1.getField("apiHeader");
        a.put(class1, kws);
        hm1;
        JVM INSTR monitorexit ;
        return kws;
        kws;
        hm1;
        JVM INSTR monitorexit ;
        throw kws;
    }

    public static void a(Context context, kws kws, String s, int i)
    {
        Object obj = null;
        lrg lrg1 = new lrg();
        Object obj1 = new lrp();
        obj1.a = Integer.valueOf(g.H(context));
        obj1.b = Integer.valueOf(g.I(context));
        obj1.c = Integer.valueOf(g.J(context));
        lrg1.j = Integer.valueOf(g.G(context));
        lrg1.p = ((lrp) (obj1));
        lrg1.i = s;
        s = (hin)hlp.b(context, hin);
        hxw hxw1;
        if (s != null)
        {
            s = s.b();
        } else
        {
            s = null;
        }
        if (!TextUtils.isEmpty(s))
        {
            lrg1.m = s;
        }
        s = new lci();
        s.b = hlp.b(context, "com.google.android.libraries.social.appid");
        if (g.L(context))
        {
            s.a = 3;
        } else
        {
            s.a = 2;
        }
        s.c = 2;
        s.d = i;
        lrg1.n = s;
        try
        {
            obj1 = a(kws);
            hxw1 = new hxw();
            hxw1.b = lrg1;
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
        context = (gwy)hlp.b(context, gwy);
        s = obj;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        s = context.a();
        hxw1.d = s;
        ((Field) (obj1)).set(kws, hxw1);
        return;
    }

}
