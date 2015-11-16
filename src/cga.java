// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class cga
    implements android.os.Parcelable.Creator
{

    cga()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        ClassLoader classloader = getClass().getClassLoader();
        cfz cfz1 = new cfz();
        cfz1.a = cgf.values()[parcel.readInt()];
        cfz1.b = (cgd)parcel.readParcelable(classloader);
        cfz1.c = parcel.readString();
        cfz1.d = parcel.readString();
        cfz1.e = parcel.readString();
        cfz1.f = parcel.readString();
        cfz1.c(parcel.readString());
        cfz1.h = parcel.readString();
        cfz1.r = parcel.readString();
        cfz1.s = parcel.readString();
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        cfz1.t = flag;
        cfz1.w = parcel.readInt();
        cfz.a(cfz1, parcel.readString());
        cfz.a(cfz1, new byte[parcel.readInt()]);
        parcel.readByteArray(cfz.a(cfz1));
        return cfz1;
    }

    public Object[] newArray(int i)
    {
        return new cfz[i];
    }
}
