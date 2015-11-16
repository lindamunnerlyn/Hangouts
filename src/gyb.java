// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

final class gyb extends gqn
{

    private final gnd a;

    public gyb(String s, gnd gnd1)
    {
        super(s);
        a = gnd1;
    }

    protected grk a(Context context)
    {
        gna agna[];
        grk grk1;
        int i;
        try
        {
            agna = a.a();
            context = new String[agna.length];
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new grk(false);
        }
        i = 0;
        if (i >= context.length)
        {
            break; /* Loop/switch isn't completed */
        }
        context[i] = agna[i].a();
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_18;
_L1:
        grk1 = new grk(true);
        grk1.d().putStringArray("account_name_array", context);
        return grk1;
    }
}
