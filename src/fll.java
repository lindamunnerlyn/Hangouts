// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolylineOptions;

public final class fll
    implements android.os.Parcelable.Creator
{

    public fll()
    {
    }

    public static PolylineOptions a(Parcel parcel)
    {
        float f = 0.0F;
        boolean flag = false;
        int k = g.a(parcel);
        java.util.ArrayList arraylist = null;
        boolean flag1 = false;
        int i = 0;
        float f1 = 0.0F;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    g.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = g.e(parcel, l);
                    break;

                case 2: // '\002'
                    arraylist = g.c(parcel, l, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    f1 = g.g(parcel, l);
                    break;

                case 4: // '\004'
                    i = g.e(parcel, l);
                    break;

                case 5: // '\005'
                    f = g.g(parcel, l);
                    break;

                case 6: // '\006'
                    flag1 = g.c(parcel, l);
                    break;

                case 7: // '\007'
                    flag = g.c(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new PolylineOptions(j, arraylist, f1, i, f, flag1, flag);
            }
        } while (true);
    }

    public static void a(PolylineOptions polylineoptions, Parcel parcel)
    {
        int i = g.p(parcel, 20293);
        g.b(parcel, 1, polylineoptions.a());
        g.c(parcel, 2, polylineoptions.b());
        g.a(parcel, 3, polylineoptions.c());
        g.b(parcel, 4, polylineoptions.d());
        g.a(parcel, 5, polylineoptions.e());
        g.a(parcel, 6, polylineoptions.f());
        g.a(parcel, 7, polylineoptions.g());
        g.q(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return new PolylineOptions[i];
    }
}
