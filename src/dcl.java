// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class dcl
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new dcm();
    public final int a;
    public final aoa b;
    public final dcw c;

    protected dcl(Parcel parcel)
    {
        b = dcn.a(parcel.readString(), parcel.readString());
        a = b.h();
        c = dcn.g(b);
    }

    public dcl(aoa aoa1)
    {
        a = aoa1.h();
        c = dcn.g(aoa1);
        b = aoa1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(b.a());
        parcel.writeString(b.ab());
    }

}
