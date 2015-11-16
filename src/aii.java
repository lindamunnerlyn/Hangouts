// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class aii
    implements android.os.Parcelable.Creator
{

    aii()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        Object obj = parcel.readString();
        boolean aflag[] = new boolean[2];
        parcel.readBooleanArray(aflag);
        obj = new aih(((String) (obj)), parcel.readInt(), parcel.readInt());
        obj.d = aflag[0];
        obj.e = aflag[1];
        obj.f = (ang)parcel.readParcelable(ang.getClassLoader());
        obj.g = parcel.readString();
        obj.m = ebr.d(parcel.readInt());
        obj.h = parcel.readLong();
        obj.i = parcel.readString();
        obj.k = parcel.readInt();
        obj.j = parcel.readString();
        obj.l = parcel.readArrayList(ang.getClassLoader());
        obj.n = ebr.d(parcel.readInt());
        obj.o = ebr.d(parcel.readInt());
        return obj;
    }

    public Object[] newArray(int i)
    {
        return new aih[i];
    }
}
