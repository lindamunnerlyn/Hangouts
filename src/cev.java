// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class cev
    implements android.os.Parcelable.Creator
{

    cev()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        ClassLoader classloader = getClass().getClassLoader();
        ceu ceu1 = new ceu();
        ceu1.a = cfa.values()[parcel.readInt()];
        ceu1.b = (cey)parcel.readParcelable(classloader);
        ceu1.c = parcel.readString();
        ceu1.d = parcel.readString();
        ceu1.e = parcel.readString();
        ceu1.f = parcel.readString();
        ceu1.c(parcel.readString());
        ceu1.h = parcel.readString();
        ceu1.r = parcel.readString();
        ceu1.s = parcel.readString();
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ceu1.t = flag;
        ceu1.w = parcel.readInt();
        ceu.a(ceu1, parcel.readString());
        ceu.a(ceu1, new byte[parcel.readInt()]);
        parcel.readByteArray(ceu.a(ceu1));
        return ceu1;
    }

    public Object[] newArray(int i)
    {
        return new ceu[i];
    }
}
