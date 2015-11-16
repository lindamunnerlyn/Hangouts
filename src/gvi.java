// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

final class gvi
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new gvj();
    public final int a;
    public final String b;
    public final gvv c;

    public gvi(int i, String s, gvv gvv1)
    {
        a = i;
        b = s;
        c = gvv1;
    }

    gvi(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readString();
        int i = parcel.readInt();
        Exception exception = (Exception)parcel.readSerializable();
        String s = parcel.readString();
        long l = parcel.readLong();
        c = new gvv(i, exception, s, parcel.createByteArray(), l);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeString(b);
        parcel.writeInt(c.a());
        parcel.writeSerializable(c.b());
        parcel.writeString(c.c());
        parcel.writeLong(c.g());
        parcel.writeByteArray(c.e());
    }

}
