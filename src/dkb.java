// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public class dkb extends dgj
    implements alx, Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new dkc();
    private final String a;

    protected dkb(Parcel parcel)
    {
        super(parcel);
        a = parcel.readString();
    }

    public dkb(aoa aoa, String s)
    {
        super(aoa);
        a = s;
    }

    public int a(alt alt)
    {
        return b(alt);
    }

    public void a()
    {
        a(((dmf) (new cxh(a))));
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.a(parcel, i);
        parcel.writeString(a);
    }

}
