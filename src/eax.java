// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

final class eax extends Binder
    implements IInterface
{

    Object a;

    eax(Object obj)
    {
        a = obj;
    }

    public IBinder asBinder()
    {
        return this;
    }
}
