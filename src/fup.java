// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;

final class fup extends emu
{

    fup()
    {
    }

    public emw a(Context context, Looper looper, epo epo, Object obj, enb enb, end end)
    {
        return new fuj(context, looper, true, epo, enb, end, Executors.newSingleThreadExecutor());
    }

    public List a()
    {
        return Arrays.asList(new Scope[] {
            fuo.e, fuo.f
        });
    }
}
