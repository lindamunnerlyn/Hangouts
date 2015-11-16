// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class dug
    implements android.os.Parcelable.Creator
{

    dug()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        duf duf1 = new duf();
        duf1.a = parcel.readString();
        duf1.b = parcel.readString();
        duf1.c = parcel.readInt();
        duf1.d = parcel.readInt();
        return duf1;
    }

    public Object[] newArray(int i)
    {
        return new duf[i];
    }
}
