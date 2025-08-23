package br.com.etecia.myapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AdapterItens extends FragmentStateAdapter {

    public AdapterItens(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position){
            case 0:
                return new TenisFragment();
            case 1:
                return new CamisasFragment();
            case 2:
                return new AcessoriosFragment();
            default:
                return new TenisFragment();
        }

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}

