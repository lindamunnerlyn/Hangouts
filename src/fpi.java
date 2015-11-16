// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Looper;

final class fpi extends emu
{

    fpi()
    {
    }

    public emw a(Context context, Looper looper, epo epo, Object obj, enb enb, end end)
    {
        obj = (fpj)obj;
        g.b(obj, "Must provide valid PeopleOptions!");
        return new fsj(context, looper, enb, end, String.valueOf(((fpj) (obj)).a), epo);
    }
}
