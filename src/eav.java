// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class eav
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new eaw();
    private eax a;

    eav(Parcel parcel)
    {
        a = (eax)parcel.readStrongBinder();
    }

    public eav(Object obj)
    {
        a = new eax(obj);
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
