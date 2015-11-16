// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

final class hcw extends guy
{

    private final grk a;

    public hcw(String s, grk grk1)
    {
        super(s);
        a = grk1;
    }

    protected gvv a(Context context)
    {
        grh agrh[];
        gvv gvv1;
        int i;
        try
        {
            agrh = a.a();
            context = new String[agrh.length];
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new gvv(false);
        }
        i = 0;
        if (i >= context.length)
        {
            break; /* Loop/switch isn't completed */
        }
        context[i] = agrh[i].a();
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_18;
_L1:
        gvv1 = new gvv(true);
        gvv1.d().putStringArray("account_name_array", context);
        return gvv1;
    }
}
