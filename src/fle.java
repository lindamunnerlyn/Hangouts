// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;

public final class fle
    implements android.os.Parcelable.Creator
{

    public fle()
    {
    }

    public static CircleOptions a(Parcel parcel)
    {
        float f = 0.0F;
        boolean flag = false;
        int l = g.a(parcel);
        LatLng latlng = null;
        double d = 0.0D;
        int i = 0;
        int j = 0;
        float f1 = 0.0F;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    g.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = g.e(parcel, i1);
                    break;

                case 2: // '\002'
                    latlng = (LatLng)g.a(parcel, i1, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    d = g.h(parcel, i1);
                    break;

                case 4: // '\004'
                    f1 = g.g(parcel, i1);
                    break;

                case 5: // '\005'
                    j = g.e(parcel, i1);
                    break;

                case 6: // '\006'
                    i = g.e(parcel, i1);
                    break;

                case 7: // '\007'
                    f = g.g(parcel, i1);
                    break;

                case 8: // '\b'
                    flag = g.c(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new CircleOptions(k, latlng, d, f1, j, i, f, flag);
            }
        } while (true);
    }

    public static void a(CircleOptions circleoptions, Parcel parcel, int i)
    {
        int j = g.p(parcel, 20293);
        g.b(parcel, 1, circleoptions.a());
        g.a(parcel, 2, circleoptions.b(), i);
        g.a(parcel, 3, circleoptions.c());
        g.a(parcel, 4, circleoptions.d());
        g.b(parcel, 5, circleoptions.e());
        g.b(parcel, 6, circleoptions.f());
        g.a(parcel, 7, circleoptions.g());
        g.a(parcel, 8, circleoptions.h());
        g.q(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return new CircleOptions[i];
    }
}
