// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.RemoteException;

public final class af extends RuntimeException
{

    public af(RemoteException remoteexception)
    {
        super(remoteexception);
    }

    public af(String s)
    {
        super(s);
    }

    public af(String s, Parcel parcel)
    {
        super((new StringBuilder()).append(s).append(" Parcel: pos=").append(parcel.dataPosition()).append(" size=").append(parcel.dataSize()).toString());
    }

    public af(String s, Exception exception)
    {
        super(s, exception);
    }

    public af(Throwable throwable)
    {
        super(throwable);
    }
}
