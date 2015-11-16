// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

final class hjm extends hjs
{

    public static final android.os.Parcelable.Creator CREATOR = new hjn();
    String a;

    public hjm(Parcel parcel)
    {
        super(parcel);
        a = parcel.readString();
    }

    public hjm(Parcelable parcelable)
    {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeString(a);
    }

}
