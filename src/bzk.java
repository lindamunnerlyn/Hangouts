// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

public class bzk
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new bzl();
    public final String a;
    public final LatLng b;
    public final CharSequence c;
    public final CharSequence d;

    bzk(Parcel parcel)
    {
        a = parcel.readString();
        b = (LatLng)parcel.readParcelable(com/google/android/gms/maps/model/LatLng.getClassLoader());
        c = parcel.readString();
        d = parcel.readString();
    }

    private bzk(String s, LatLng latlng, CharSequence charsequence, CharSequence charsequence1)
    {
        a = s;
        b = latlng;
        c = charsequence;
        d = charsequence1;
    }

    public static bzk a(fik fik1)
    {
        return new bzk(fik1.a(), fik1.d(), fik1.b(), fik1.c());
    }

    public fik a()
    {
        return new bzm(this);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeParcelable(b, 0);
        parcel.writeString(c.toString());
        parcel.writeString(d.toString());
    }

}
