// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class aib
    implements android.os.Parcelable.Creator
{

    aib()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        Object obj = parcel.readString();
        boolean aflag[] = new boolean[2];
        parcel.readBooleanArray(aflag);
        obj = new aia(((String) (obj)), parcel.readInt(), parcel.readInt());
        obj.d = aflag[0];
        obj.e = aflag[1];
        obj.f = (any)parcel.readParcelable(any.getClassLoader());
        obj.g = parcel.readString();
        obj.m = eep.d(parcel.readInt());
        obj.h = parcel.readLong();
        obj.i = parcel.readString();
        obj.k = parcel.readInt();
        obj.j = parcel.readString();
        obj.l = parcel.readArrayList(any.getClassLoader());
        obj.n = eep.d(parcel.readInt());
        obj.o = eep.d(parcel.readInt());
        return obj;
    }

    public Object[] newArray(int i)
    {
        return new aia[i];
    }
}
