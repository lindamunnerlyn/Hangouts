// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolygonOptions;
import java.util.ArrayList;

public final class flk
    implements android.os.Parcelable.Creator
{

    public flk()
    {
    }

    public static void a(PolygonOptions polygonoptions, Parcel parcel)
    {
        int i = g.p(parcel, 20293);
        g.b(parcel, 1, polygonoptions.a());
        g.c(parcel, 2, polygonoptions.c());
        java.util.List list = polygonoptions.b();
        if (list != null)
        {
            int j = g.p(parcel, 3);
            parcel.writeList(list);
            g.q(parcel, j);
        }
        g.a(parcel, 4, polygonoptions.d());
        g.b(parcel, 5, polygonoptions.e());
        g.b(parcel, 6, polygonoptions.f());
        g.a(parcel, 7, polygonoptions.g());
        g.a(parcel, 8, polygonoptions.h());
        g.a(parcel, 9, polygonoptions.i());
        g.q(parcel, i);
    }

    public PolygonOptions a(Parcel parcel)
    {
        float f = 0.0F;
        boolean flag = false;
        int l = g.a(parcel);
        ArrayList arraylist = null;
        ArrayList arraylist1 = new ArrayList();
        boolean flag1 = false;
        int i = 0;
        int j = 0;
        float f1 = 0.0F;
        int k = 0;
        do
        {
            if (parcel.dataPosition() >= l)
            {
                break;
            }
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
                arraylist = g.c(parcel, i1, LatLng.CREATOR);
                break;

            case 3: // '\003'
                ClassLoader classloader = getClass().getClassLoader();
                i1 = g.a(parcel, i1);
                int j1 = parcel.dataPosition();
                if (i1 != 0)
                {
                    parcel.readList(arraylist1, classloader);
                    parcel.setDataPosition(i1 + j1);
                }
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
                flag1 = g.c(parcel, i1);
                break;

            case 9: // '\t'
                flag = g.c(parcel, i1);
                break;
            }
        } while (true);
        if (parcel.dataPosition() != l)
        {
            throw new af((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
        } else
        {
            return new PolygonOptions(k, arraylist, arraylist1, f1, j, i, f, flag1, flag);
        }
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return new PolygonOptions[i];
    }
}
