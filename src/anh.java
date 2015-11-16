// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class anh
    implements android.os.Parcelable.Creator
{

    anh()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        ang ang1 = new ang();
        ang1.b = parcel.readString();
        ang1.c = parcel.readString();
        ang1.d = parcel.readString();
        ang1.e = parcel.readInt();
        ang1.f = parcel.readString();
        ang1.g = parcel.readString();
        return ang1;
    }

    public Object[] newArray(int i)
    {
        return new ang[i];
    }
}
