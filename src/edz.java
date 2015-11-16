// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class edz
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new eea();
    private eeb a;

    edz(Parcel parcel)
    {
        a = (eeb)parcel.readStrongBinder();
    }

    public edz(Object obj)
    {
        a = new eeb(obj);
    }

    public Object a()
    {
        return a.a;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeStrongBinder(a.asBinder());
    }

}
