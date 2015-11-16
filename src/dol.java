// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

public abstract class dol
{

    public dol()
    {
    }

    public abstract Class a();

    public abstract void a(Context context, Intent intent);

    public Intent b(Context context, Intent intent)
    {
        intent.putExtra("ds_processor", getClass().getName());
        intent.setClass(context, a());
        return intent;
    }
}
